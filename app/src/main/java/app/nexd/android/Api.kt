package app.nexd.android

import app.nexd.android.api.*
import com.itkacher.okhttpprofiler.OkHttpProfilerInterceptor
import io.reactivex.schedulers.Schedulers.io
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

lateinit var api: Api

class Api(private val apiClient: ApiClient = NexdApiClient()) :
    AuthApi by apiClient.createService(AuthApi::class.java),
    ArticlesApi by apiClient.createService(ArticlesApi::class.java),
    HelpListsApi by apiClient.createService(HelpListsApi::class.java),
    HelpRequestsApi by apiClient.createService(HelpRequestsApi::class.java),
    UsersApi by apiClient.createService(UsersApi::class.java),
    PhoneApi by apiClient.createService(PhoneApi::class.java) {

    fun setBearerToken(token: String?) {
        apiClient.setBearerToken(token)
    }

}

private class NexdApiClient : ApiClient("bearer") {

    override fun createDefaultAdapter() {
        super.createDefaultAdapter()

        var baseUrl = BuildConfig.API_BASE_URL
        if (!baseUrl.endsWith("/")) baseUrl = "$baseUrl/"

        adapterBuilder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(io()))
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonCustomConverterFactory.create(JSON().gson))


        val loggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        okBuilder.addInterceptor(loggingInterceptor)

        okBuilder.addInterceptor(OkHttpProfilerInterceptor())
    }
}