package org.clulab.grid

import utest._

import scala.scalajs.js

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.ext._

object GridsTest extends TestSuite {

  // Initialize App
  GridApp.setupUI()

  def tests = Tests {
    test("HelloWorld") {
      assert(document.querySelectorAll("p").count(_.textContent == "Hello, world!") == 1)
    }
  }
}