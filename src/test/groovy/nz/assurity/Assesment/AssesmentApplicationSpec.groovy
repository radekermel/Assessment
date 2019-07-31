package nz.assurity.Assesment

import io.restassured.RestAssured
import org.hamcrest.core.Is
import org.hamcrest.core.IsEqual
import org.hamcrest.core.StringContains
import spock.lang.Specification

class AssesmentApplicationSpec extends Specification {

    static final ADDRESS_URL = 'https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false'
    static final String JSON_PATH = "Promotions.findAll { it.Name == 'Gallery'}.Description[0]"

    def restApiAssessmentTest() {
        expect:
        RestAssured
                .get(ADDRESS_URL)
                .then()
                .assertThat()
                .body("Name", Is.is("Carbon credits"))
                .body("CanRelist", IsEqual.equalTo(true))
                .body(JSON_PATH, new StringContains("2x larger image"))
    }
}
