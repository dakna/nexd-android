package de.andrestefanov.android.nearbuy.ui.view

import android.content.Context
import android.widget.LinearLayout
import de.andrestefanov.android.nearbuy.R
import de.andrestefanov.android.nearbuy.api.model.RequestEntity
import kotlinx.android.synthetic.main.view_request_delivery.view.*

class RequestDeliveryView(context: Context, var request: RequestEntity): LinearLayout(context) {

    init {
        inflate(context, R.layout.view_request_delivery, this)

        name.text = request.requester?.lastName
        address.text = "Adresse:\n${request.street} ${request.number}"
        phonenumber.text = "Tel: ${request.phoneNumber}"
    }

}