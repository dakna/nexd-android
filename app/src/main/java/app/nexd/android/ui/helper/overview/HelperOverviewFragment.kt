package app.nexd.android.ui.helper.overview

import android.os.Build
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import app.nexd.android.R
import app.nexd.android.api.model.RequestEntity
import app.nexd.android.ui.helper.overview.HelperOverviewFragmentDirections.Companion.actionBuyerOverviewFragmentToShoppingListFragment
import app.nexd.android.ui.helper.overview.HelperOverviewFragmentDirections.Companion.requestDetailAction
import kotlinx.android.synthetic.main.fragment_helper_request_overview.*
import mva2.adapter.ListSection
import mva2.adapter.MultiViewAdapter

class HelperOverviewFragment : Fragment() {

    private lateinit var viewModel: HelperOverviewViewModel
    private lateinit var nearRequestsAdapter: MultiViewAdapter
    private lateinit var acceptedRequestsAdapter: MultiViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_helper_request_overview, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HelperOverviewViewModel::class.java)

        acceptedRequestsAdapter = MultiViewAdapter()
        recyclerView_acceptedRequests.layoutManager = LinearLayoutManager(context)
        recyclerView_acceptedRequests.adapter = acceptedRequestsAdapter

        nearRequestsAdapter = MultiViewAdapter();
        recyclerView_nearRequests.layoutManager = LinearLayoutManager(context)
        recyclerView_nearRequests.adapter = nearRequestsAdapter


        acceptedRequestsAdapter.registerItemBinders(
            HelperOverviewBinder()
        )
        nearRequestsAdapter.registerItemBinders(
            HelperOverviewBinder()
        )

        viewModel.run {
            getMyAcceptedRequests().observe(viewLifecycleOwner, Observer { requests ->

                val myAcceptedRequests = requests.filter {
                    it.status == RequestEntity.StatusEnum.ONGOING
                }
                updateAcceptedRequests(myAcceptedRequests)

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    button_shopping.text = Html.fromHtml(
                        "<b>" +
                                getString(R.string.helper_request_overview_button_summary_title)
                                + "</b> (" +
                            getString(R.string.helper_request_overview_button_summary_details)
                                + " " +
                            myAcceptedRequests.map { requestEntity -> requestEntity.articles.size }.sum()
                                + "/ 20)",
                        Html.FROM_HTML_MODE_LEGACY
                    )
                } else {
                    button_shopping.text = Html.fromHtml(
                        "<b>%1</b> (%2 %3 / 20)".format(getString(R.string.helper_request_overview_button_summary_title),
                            getString(R.string.helper_request_overview_button_summary_details),
                            myAcceptedRequests.map { requestEntity -> requestEntity.articles.size }.sum())
                    )
                }
            })

            getOtherOpenRequests().observe(viewLifecycleOwner, Observer { requests ->
                updateNearbyOpenRequests(requests)
            })
        }

        button_shopping.setOnClickListener {
            findNavController().navigate(actionBuyerOverviewFragmentToShoppingListFragment())
        }
    }

    override fun onResume() {
        super.onResume()

        viewModel.reloadData()
    }

    private fun updateAcceptedRequests(acceptedRequests: List<RequestEntity>) {
        acceptedRequestsAdapter.removeAllSections()

        val acceptedRequestsList = ListSection<RequestEntity>()

        acceptedRequestsList.addAll(acceptedRequests)
        acceptedRequestsList.setOnSelectionChangedListener { request: RequestEntity,
                                                             b: Boolean, _: MutableList<RequestEntity> ->
            if (b) {
                val action =
                    requestDetailAction(
                        request.id.toString()
                    )
                findNavController().navigate(action)
            }
        }
        acceptedRequestsAdapter.addSection(acceptedRequestsList)
    }

    private fun updateNearbyOpenRequests(nearRequests: List<RequestEntity>) {
        nearRequestsAdapter.removeAllSections()

        val nearRequestList = ListSection<RequestEntity>()
        nearRequestList.addAll(nearRequests)

        nearRequestList.setOnSelectionChangedListener { helpRequest: RequestEntity,
                                                        b: Boolean, _: MutableList<RequestEntity> ->
            if (b) {
                val action =
                    requestDetailAction(
                        helpRequest.id.toString()
                    )
                findNavController().navigate(action)
            }
        }
        nearRequestsAdapter.addSection(nearRequestList)
    }

}