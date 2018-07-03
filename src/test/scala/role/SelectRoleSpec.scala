package role

import org.openqa.selenium._
import im.mange.flakeless._
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.scalatest.Matchers._
import org.scalatest.WordSpec
import org.scalatest.selenium.WebBrowser

class SelectRoleSpec extends WordSpec with WebBrowser {

  implicit val webDriver: WebDriver = new HtmlUnitDriver

  "Select Role" should {

    "click the submit button" in {
      go to "http://localhost:9000/customs-declare-exports-frontend/selectRole"

      pageTitle shouldEqual "Select role"

      Click(webDriver, By.id("submit"))
    }
  }
}

