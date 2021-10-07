package io.compwiz.countrylister.helpers


import com.google.common.io.Resources
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest
import java.io.File
import java.net.HttpURLConnection

class CountriesRequestDispatcher: Dispatcher() {
    override fun dispatch(request: RecordedRequest): MockResponse {
        return MockResponse()
            .setResponseCode(HttpURLConnection.HTTP_OK)
            .setBody(getJson("json/countries.json"))
    }
}
fun getJson(path: String): String {
    val uri = Resources.getResource(path)
    val file = File(uri.path)
    return String(file.readBytes())
}