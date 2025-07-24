package ch.makery.address.view

import ch.makery.address.MainApp
import javafx.event.ActionEvent
import javafx.fxml.FXML

@FXML
class RootLayoutController():
  
  @FXML
  def handleClose(action: ActionEvent): Unit = {
    MainApp.stage.close()
    //System.exit(0) for force exit
  }

  @FXML
  def handleDelete(action: ActionEvent): Unit = {
    //done to access the personoverviewcontroller because the function is already made
    MainApp.overviewControl.map(x => x.handleDeletePerson(action))
  }



