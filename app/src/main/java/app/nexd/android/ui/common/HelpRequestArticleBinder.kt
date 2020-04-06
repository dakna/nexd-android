package app.nexd.android.ui.common

import android.view.View
import android.view.ViewGroup
import app.nexd.android.R
import app.nexd.android.api.model.HelpRequestArticle
import kotlinx.android.synthetic.main.row_help_request_article.view.*
import mva2.adapter.ItemBinder
import mva2.adapter.ItemViewHolder

class HelpRequestArticleBinder(private val checkable: Boolean = false) :
    ItemBinder<HelpRequestArticle, HelpRequestArticleBinder.ViewHolder>() {

    inner class ViewHolder(itemView: View) : ItemViewHolder<HelpRequestArticle>(itemView) {

        fun bind(item: HelpRequestArticle) {
            itemView.textView_amount.text = itemView.context.getString(
                R.string.helper_checkout_list_amount_layout,
                item.articleCount
            )
            itemView.textView_name.text = item.article?.name
            if (checkable) {
                itemView.checkbox_checked.isChecked = item.articleDone ?: false
                itemView.checkbox_checked.isEnabled = false
                itemView.checkbox_checked.visibility = View.VISIBLE
            } else {
                itemView.checkbox_checked.visibility = View.GONE
            }
        }
    }

    override fun bindViewHolder(holder: ViewHolder, item: HelpRequestArticle) {
        holder.bind(item)
    }

    override fun createViewHolder(parent: ViewGroup): ViewHolder {
        return ViewHolder(
            inflate(parent, R.layout.row_help_request_article)
        )
    }

    override fun canBindData(item: Any): Boolean {
        return item is HelpRequestArticle
    }
}