package hust.soict.hedspi.gui;

import java.io.IOException;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyController {
//	@FXML
//	Button btnNumber1;
	public static Order anOrder=null;
	public Label thong_bao;
	@FXML
	private TextField tf_id;
	@FXML
	private TextField cost;
	@FXML
	private TextField size;
	static public ObservableList<Media> itemsList = FXCollections.observableArrayList();
	
	// exit program
	public void exitProgram(ActionEvent event) {
		System.exit(0);
	}
	//newOrder
	public void CreateNewOder(ActionEvent event) {
			try{
				anOrder=new Order();
				MyDate day = new MyDate();
				anOrder.setDateOrdered(day);
			}catch (Exception e){
				e.printStackTrace();
			}
			thong_bao.setText("!!!New order have been created!!!");
	}
	//Add Item 
	public void AddItem(ActionEvent event) {
		if(anOrder==null) {
			thong_bao.setText("!!!No orders have been created!!!");
		}
		else {
			try {
				Parent root = FXMLLoader.load(this.getClass().getResource("InputItem.fxml"));
				Stage stage = new Stage();
	            stage.setTitle("Add item to Order!!!");
	            stage.setScene(new Scene(root));
	            stage.show();
	            // Hide this current window (if this is what you want)
//	            ((Node)(event.getSource())).getScene().getWindow().hide();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void onClickBook(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(this.getClass().getResource("AddBookItem.fxml"));
			Stage stage = new Stage();
            stage.setTitle("Book Item List!!!");
            stage.setScene(new Scene(root));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void addBook1(ActionEvent event) {
		ArrayList <String> authors = new ArrayList<String>();
		authors.add("Van Cao");
		authors.add("To Huu");
		Book book1 = new Book("Tay Tien","Documentory",10.5f,authors,1);
		anOrder.addMedia(book1);
		((Node)(event.getSource())).getScene().getWindow().hide();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Add Book");

		// Header Text: null
		alert.setHeaderText(null);
		alert.setContentText("Add Tay Tien sucessfully!!!");
		alert.showAndWait();
		
	}
	public void addBook2(ActionEvent event) {
		ArrayList <String> authors = new ArrayList<String>();
		authors.add("Van Cao");
		authors.add("To Huu");
		Book book2 = new Book("Tat Den","Documentory",15.5f,authors,2);
		anOrder.addMedia(book2);
		((Node)(event.getSource())).getScene().getWindow().hide();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Add Book");

		// Header Text: null
		alert.setHeaderText(null);
		alert.setContentText("Add Tat Den sucessfully!!!");
		alert.showAndWait();
	}
	
	public void onClickDisc(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(this.getClass().getResource("AddDiscItem.fxml"));
			Stage stage = new Stage();
            stage.setTitle("Disc Item List!!!");
            stage.setScene(new Scene(root));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addDisc1(ActionEvent event) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f,123);
		anOrder.addMedia(dvd1);
		((Node)(event.getSource())).getScene().getWindow().hide();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Add Book");

		// Header Text: null
		alert.setHeaderText(null);
		alert.setContentText("Add DVD The Lion King sucessfully!!!");
		alert.showAndWait();
	}
	public void addDisc2(ActionEvent event) {
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",124,24.95f,124);
		anOrder.addMedia(dvd2);
		((Node)(event.getSource())).getScene().getWindow().hide();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Add DVD");

		// Header Text: null
		alert.setHeaderText(null);
		alert.setContentText("Add DVD Star Wars  sucessfully!!!");
		alert.showAndWait();
	}
	public void addCD(ActionEvent event) {
		Track track1 = new Track("My heart", 3);
		Track track2 = new Track("Ahihi", 4);
		ArrayList<Track> TrackList=new ArrayList<Track>();
		TrackList.add(track1);
		TrackList.add(track2);
		CompactDisc compactDisc1 = new CompactDisc("Lover",TrackList, "Ahihi", "Taylor Swift",100,456);
		anOrder.addMedia(compactDisc1);
		((Node)(event.getSource())).getScene().getWindow().hide();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Add DVD");

		// Header Text: null
		alert.setHeaderText(null);
		alert.setContentText("Add sucessfully!!!");
		alert.showAndWait();
	}
	//deleted Form

	 public void deleteItem(ActionEvent event) {
		 if(anOrder == null) {
				thong_bao.setText("Creat an oder first!!!");
			}
			else {
				try {
					Parent root = FXMLLoader.load(this.getClass().getResource("deleteForm.fxml"));
					Stage stage = new Stage();
		            stage.setTitle("Deleted item in form !!!");
		            stage.setScene(new Scene(root));
		            stage.show();
		            // Hide this current window (if this is what you want)
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    }
	 
	 public void submitDelete(ActionEvent event) {
		 if(tf_id.getText() == null) {
			 
		 }else {
			 System.out.println(anOrder.getItemOrdered().size());
			 if(Integer.parseInt(tf_id.getText()) > anOrder.getItemOrdered().size()) {
				 Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Delete item ");
					alert.setHeaderText(null);
					alert.setContentText("ID invalid!!!");
					alert.showAndWait();
					((Node)(event.getSource())).getScene().getWindow().hide();
				}
				anOrder.removeMedia(Integer.parseInt(tf_id.getText()));
				 Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Delete by id");
					alert.setHeaderText(null);
					alert.setContentText("Deleted!!!");
					alert.showAndWait();
				((Node)(event.getSource())).getScene().getWindow().hide();
		 }
	 }
	
	//print Order
	
	public void displayOrder(ActionEvent event) {
		 TableView<Media> table = new TableView<Media>();


	      TableColumn<Media, String> titleCol //
	              = new TableColumn<Media, String>("title");

	      TableColumn<Media, String> categoryCol//
	              = new TableColumn<Media, String>("category");
	      TableColumn<Media, String> costCol//
         = new TableColumn<Media, String>("cost");

	      table.getColumns().addAll(titleCol, categoryCol, costCol);
	      
	      titleCol.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
	      categoryCol.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
	      costCol.setCellValueFactory(new PropertyValueFactory<>("cost"));
	      
	      itemsList.removeAll(itemsList);

	      ArrayList<Media> tmp = anOrder.getItemOrdered();
	      for(int i = 0; i < tmp.size(); i++) {
				itemsList.add(tmp.get(i));
	      }
	      
	      table.setItems(itemsList);
	      StackPane root = new StackPane();
	      root.getChildren().add(table);
	      Scene scene = new Scene(root);
			Stage stage = new Stage();
         stage.setTitle("Items list");
         stage.setScene(scene);
         stage.show();
	      
	 }
	//getLuckyItem Lab10 
	
	public void getLuckyItem(ActionEvent event) {
		 if(anOrder == null) {
				thong_bao.setText("Creat an oder first!!!");
			}
			else {
				try {
					Parent root = FXMLLoader.load(this.getClass().getResource("getLuckyItem.fxml"));
					Stage stage = new Stage();
		            stage.setTitle("Deleted item in form !!!");
		            stage.setScene(new Scene(root));
		            stage.show();
		            // Hide this current window (if this is what you want)
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    }
	
	public void submitLucky(ActionEvent event) {
		 if(cost.getText() == null||size.getText()==null) {
			 
		 }else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Lucky Item ");
			alert.setHeaderText(null);
			alert.setContentText("Cost: " +Integer.parseInt(cost.getText())+", Size: "+ Integer.parseInt(size.getText()));
			alert.showAndWait();
			if(Integer.parseInt(cost.getText()) < anOrder.totalCost()&&Integer.parseInt(size.getText()) < anOrder.getItemOrdered().size()) {
				int random;
				random = (int) (100* Math.random());
				System.out.println(random);
				if(random>30) {
					Media luckyitem = anOrder.getALuckyItem();
					if(luckyitem.getCost() > anOrder.totalCost()) {
						alert.setTitle("No get lucky Item");
						alert.setHeaderText(null);
						alert.setContentText("Wish you luck next time");
						alert.showAndWait();
					}
					else {
						alert.setTitle("get lucky Item");
						alert.setHeaderText(null);
						alert.setContentText("win prize: add "+luckyitem.getTitle()+ " to Order");
						alert.showAndWait();
						anOrder.addMedia(luckyitem);
					}
				}
				else {
					alert.setTitle("No get lucky Item");
					alert.setHeaderText(null);
					alert.setContentText("Wish you luck next time");
					alert.showAndWait();
				}
			}
			else {
				alert.setTitle("Lucky Item ");
				alert.setHeaderText(null);
				alert.setContentText("Buy more to get reward");
				alert.showAndWait();
			}
			((Node)(event.getSource())).getScene().getWindow().hide();
		 }
			 
		 

	
	}
	
	
	
	
	
}