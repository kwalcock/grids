package org.clulab.grids.webapp.controllers

import play.api.mvc._
import play.api.libs.json

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GridController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getData(userID: Long): Action[AnyContent] = Action {
    println("Getting data for user ID")

    Ok
  }

  def getSetUser(userID: Long): Action[AnyContent] = Action { request =>
    println(s"Setting user ID: $userID")
    val result: json.JsValue = json.JsBoolean(true)

    Ok(result)
  }

  def getLoadTrainingGrid(userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getLoadCurationGrid(userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getLoadTestGrid(userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getLoadNewGrid(newAnchor: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getUpdateAnchorBook(key: String, value: String, addOrRemove: String, userId: Long): Action[AnyContent] = Action {
    Ok
  }

  def getDrag(row: String, col: String, hexSent: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getClick(row: String, col: String, edit: Boolean, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getSentenceClick(hexText: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getEditName(ix: Int, newName: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getDeleteFrozenColumn(ix: Int, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getTextInput(text: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getSetK(k: Int, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getRegenerate(userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getCopyToggle(userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getSaveGrid(text: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getLoadGrid(text: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getTrash(text: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getToggleTraining(userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getAnswerQuestion(questionSet: String, questionIndex: Int, hexSelectedAnswerText: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getRecordAnswers(questionSet: String, userID: Long): Action[AnyContent] = Action {
    Ok
  }

  def getRecordConsent(userID: Long): Action[AnyContent] = Action {
    Ok
  }
}
