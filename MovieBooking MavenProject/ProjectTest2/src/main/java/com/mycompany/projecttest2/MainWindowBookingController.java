/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.projecttest2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author chonl
 */

public class MainWindowBookingController implements Initializable{
    
    @FXML
    private AnchorPane topForm;
    
    @FXML
    private AnchorPane addMovies_ImageView;

    @FXML
    private Button addMovies_Import;

    @FXML
    private TextField addMovies_MovieTitle;

    @FXML
    private Button addMovies_btn;

    @FXML
    private Button addMovies_clearBtn;

    @FXML
    private TableColumn<MovieData,String> addMovies_col_MovieTitle;

    @FXML
    private TableColumn<MovieData,String> addMovies_col_date;

    @FXML
    private TableColumn<MovieData,String> addMovies_col_duration;

    @FXML
    private TableColumn<MovieData,String> addMovies_col_genre;

    @FXML
    private TextField addMovies_date;
    
    @FXML
    private DatePicker avalibleMovies_date2;

    @FXML
    private Button addMovies_deleteBtn;

    @FXML
    private TextField addMovies_duration;

    @FXML
    private AnchorPane addMovies_form;

    @FXML
    private TextField addMovies_genre;

    @FXML
    private Button addMovies_insertBtn;

    @FXML
    private TextField addMovies_search;

    @FXML
    private TableView<MovieData> addMovies_tableview;

    @FXML
    private Button addMovies_updateBtn;

    @FXML
    private Button avalibleMovies_btn;

    @FXML
    private Button avalibleMovies_buyBtn;

    @FXML
    private Button avalibleMovies_clearBtn;

    @FXML
    private TableColumn<MovieData,String> avalibleMovies_col_genre;

    @FXML
    private TableColumn<MovieData,String> avalibleMovies_col_movieTitle;

    @FXML
    private TableColumn<MovieData,String> avalibleMovies_col_showingdata;

    @FXML
    private Label avalibleMovies_date;

    @FXML
    private AnchorPane avalibleMovies_form;

    @FXML
    private Label avalibleMovies_genre;

    @FXML
    private AnchorPane avalibleMovies_imageView;

    @FXML
    private Label avalibleMovies_movieTitle;

    @FXML
    private Label avalibleMovies_normalClass_price;

    @FXML
    private Spinner<Integer> avalibleMovies_normalClass_quantity;

    @FXML
    private Button avalibleMovies_receiptBtn;

    @FXML
    private Button avalibleMovies_selectMovieBtn;

    @FXML
    private Label avalibleMovies_specialClass_price;

    @FXML
    private Spinner<Integer> avalibleMovies_specialClass_quantity;

    @FXML
    private TableView<MovieData> avalibleMovies_tableView;

    @FXML
    private Label avalibleMovies_title;

    @FXML
    private Label avalibleMovies_total;

    @FXML
    private Button close;

    @FXML
    private Button customers_btn;

    @FXML
    private Button customers_clearBtn;

    @FXML
    private TableColumn<Recipe,String> customers_col_date;

    @FXML
    private TableColumn<Recipe,String> customers_col_genre;

    @FXML
    private TableColumn<Recipe,String> customers_col_movieTitle;

    @FXML
    private TableColumn<Recipe,String> customers_col_ticketNumber;

    @FXML
    private TableColumn<Recipe,String> customers_col_time;

    @FXML
    private Label customers_date;

    @FXML
    private Button customers_deleteBtn;

    @FXML
    private AnchorPane customers_form;

    @FXML
    private Label customers_genre;

    @FXML
    private Label customers_movieTitle;

    @FXML
    private TextField customers_search;

    @FXML
    private TableView<Recipe> customers_tableView;

    @FXML
    private Label customers_ticketNumber;

    @FXML
    private Label customers_time;

    @FXML
    private AnchorPane dashboard_TotalEarnToday;

    @FXML
    private AnchorPane dashboard_TotalSoldTicket;

    @FXML
    private AnchorPane dashboard_avalibleMovies;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private Button editScreening_btn;

    @FXML
    private TableColumn<MovieData, String> editScreening_col_current;

    @FXML
    private TableColumn<MovieData, String> editScreening_col_duration;

    @FXML
    private TableColumn<MovieData, String> editScreening_col_genre;

    @FXML
    private TableColumn<MovieData, String> editScreening_col_movieTitle;

    @FXML
    private ComboBox<String> editScreening_current;

    @FXML
    private Button editScreening_deleteBtn;

    @FXML
    private AnchorPane editScreening_form;

    @FXML
    private AnchorPane editScreening_imageView;
    
    @FXML
    private ImageView editScreening_imageView2;
    
    @FXML
    private TextField editScreening_search;

    @FXML
    private TableView<MovieData> editScreening_tableView;

    @FXML
    private Label editScreening_title;

    @FXML
    private Button editScreening_updateBtn;

    @FXML
    private Button minimize;
    
     @FXML
    private DatePicker addMovies_date2;

    @FXML
    public static Label username;
    
    private String Username;
    
    private Image image;
    @FXML
    private ImageView addMovies_ImageView2;
    
    @FXML
    private ImageView AvalibleMovie_ImageView;

    @FXML
    private TableColumn<Recipe, Integer> recipe_Total_col;
    @FXML
    private Label recipe_date;
    @FXML
    private AnchorPane recipe_form;

    @FXML
    private TableColumn<Recipe, String> recipe_movieTitle_col;

    @FXML
    private TableView<Recipe> recipe_tableview;

    @FXML
    private Label recipe_ticketnumber;

    @FXML
    private Label recipe_total;

    @FXML
    private TableColumn<Recipe, String> recipe_type_col;
    
    @FXML
    private Button avalibleMovies_RecipeBackBtn;

    @FXML
    private Button avalibleMovies_RecipeHistoryBtn;
    
     @FXML
    private Label recipe_MovieTitle;

    @FXML
    private Label recipe_Total;
    
    @FXML
    private Label recipe_type;
    
    @FXML
    private DatePicker recipe_date2;
    
    @FXML
    private Label recipe_time;

    @FXML
    private TextField recipe_time2;
    
     @FXML
    private TextField recipe_date3;

    @FXML
    private TableColumn<Recipe, String> recipe_seatNumber_col;
    
    @FXML
    private ComboBox<String> avalibleMovies_seatNumber;
    
     @FXML
    private DatePicker recipe_date4;
    
    @FXML
    private Label dashboard_totalMovie;

    @FXML
    private Label dashboard_totalSalary;

    @FXML
    private Label dashboard_totalTicket;
    
    public void setUsername(String name) {
        username.setText(name);
}
    
    
    
    private ObservableList<MovieData> listMovies;
    
    private String[] currentList = {"Showing","End Showing"};    
    public void comboBox(){
        List<String> listCurrent = new ArrayList<>();
        for(String data : currentList){
            listCurrent.add(data);
        }
        ObservableList listC = FXCollections.observableArrayList(listCurrent);
        editScreening_current.setItems(listC);
                      
    
    }
    
    
    public void switchForm(ActionEvent event){
        if(event.getSource() == dashboard_btn){
            dashboard_form.setVisible(true);
            addMovies_form.setVisible(false);
            avalibleMovies_form.setVisible(false);
            editScreening_form.setVisible(false);
            customers_form.setVisible(false);
            recipe_form.setVisible(false);

            
            dashboard_btn.setStyle("fx-background-color:#ae2d3c");
            addMovies_btn.setStyle("fx-background-color:#transparent");
            avalibleMovies_btn.setStyle("fx-background-color:#transparent");
            editScreening_btn.setStyle("fx-background-color:#transparent");
            customers_btn.setStyle("fx-background-color:#transparent");
        }
        else if(event.getSource() == addMovies_btn){
            dashboard_form.setVisible(false);
            addMovies_form.setVisible(true);
            avalibleMovies_form.setVisible(false);
            editScreening_form.setVisible(false);
            customers_form.setVisible(false);
            recipe_form.setVisible(false);

            
            dashboard_btn.setStyle("fx-background-color:#transparent");
            addMovies_btn.setStyle("fx-background-color:#ae2d3c");
            avalibleMovies_btn.setStyle("fx-background-color:#transparent");
            editScreening_btn.setStyle("fx-background-color:#transparent");
            customers_btn.setStyle("fx-background-color:#transparent");
        }
        else if(event.getSource() == avalibleMovies_btn){
            dashboard_form.setVisible(false);
            addMovies_form.setVisible(false);
            avalibleMovies_form.setVisible(true);
            editScreening_form.setVisible(false);
            customers_form.setVisible(false);
            recipe_form.setVisible(false);

            
            dashboard_btn.setStyle("fx-background-color:#transparent");
            addMovies_btn.setStyle("fx-background-color:#transparent");
            avalibleMovies_btn.setStyle("fx-background-color:#ae2d3c");
            editScreening_btn.setStyle("fx-background-color:#transparent");
            customers_btn.setStyle("fx-background-color:#transparent");
        }
        else if(event.getSource() == editScreening_btn){
            dashboard_form.setVisible(false);
            addMovies_form.setVisible(false);
            avalibleMovies_form.setVisible(false);
            editScreening_form.setVisible(true);
            customers_form.setVisible(false);
            recipe_form.setVisible(false);

            
            dashboard_btn.setStyle("fx-background-color:#transparent");
            addMovies_btn.setStyle("fx-background-color:#transparent");
            avalibleMovies_btn.setStyle("fx-background-color:#transparent");
            editScreening_btn.setStyle("fx-background-color:#ae2d3c");
            customers_btn.setStyle("fx-background-color:#transparent");
        }
        else if(event.getSource() == customers_btn){
            dashboard_form.setVisible(false);
            addMovies_form.setVisible(false);
            avalibleMovies_form.setVisible(false);
            editScreening_form.setVisible(false);
            customers_form.setVisible(true);
            recipe_form.setVisible(false);
            
            dashboard_btn.setStyle("fx-background-color:#transparent");
            addMovies_btn.setStyle("fx-background-color:#transparent");
            avalibleMovies_btn.setStyle("fx-background-color:#transparent");
            editScreening_btn.setStyle("fx-background-color:#transparent");
            customers_btn.setStyle("fx-background-color:#ae2d3c");
        }
        else if(event.getSource() == avalibleMovies_receiptBtn){
            dashboard_form.setVisible(false);
            addMovies_form.setVisible(false);
            avalibleMovies_form.setVisible(false);
            editScreening_form.setVisible(false);
            customers_form.setVisible(false);
            recipe_form.setVisible(true);
                          

        }
        else if(event.getSource() == avalibleMovies_RecipeBackBtn){
            dashboard_form.setVisible(false);
            addMovies_form.setVisible(false);
            avalibleMovies_form.setVisible(true);
            editScreening_form.setVisible(false);
            customers_form.setVisible(false);
            recipe_form.setVisible(false);
            
                
        }
    }
    ObservableList<MovieData> editSList;
    public void showEditScreening(ObservableList<MovieData> movieList){
        //editSList = movieList;
        editScreening_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        //addMovies_col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        editScreening_col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        editScreening_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        editScreening_col_current.setCellValueFactory(new PropertyValueFactory<>("current"));
                

        editScreening_tableView.setItems(movieList);
    }
    public void showAvalibleMovies(ObservableList<MovieData> movieList){
        //editSList = movieList;
        avalibleMovies_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        //addMovies_col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        //editScreening_col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        avalibleMovies_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        //editScreening_col_current.setCellValueFactory(new PropertyValueFactory<>("current"));
        avalibleMovies_col_showingdata.setCellValueFactory(new PropertyValueFactory<>("date")); 

        avalibleMovies_tableView.setItems(movieList);
    }
    //public void displayUsername(String name){
    //    username.setText(name);
    //}
    
    public void close(){
        System.exit(0);
    }
    public void minimize(){
        Stage stage = (Stage)topForm.getScene().getWindow();
        stage.setIconified(true);
    }
    
    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("Login");
    }
    //public void displayUsername(){
    //    username.setText(getData.username);
    //}
    /**
     * Initializes the controller class.
     
     */
    @FXML
public void importImage(ActionEvent event) {
    
    FileChooser open = new FileChooser();
    open.setTitle("Open Image File");
    open.getExtensionFilters().add(new ExtensionFilter("Image File","*png","*jpg"));
    Stage stage = (Stage)addMovies_form.getScene().getWindow();
    File file = open.showOpenDialog(stage);
    if(file!=null){
        image = new Image(file.toURI().toString(),164,152,false,true);
        addMovies_ImageView2.setImage(image);
    }
}
    
    ObservableList<MovieData> movieDataList = FXCollections.observableArrayList();
    
    private void showMovieList(ObservableList<MovieData> movieList) {
    
    addMovies_col_MovieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
    addMovies_col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
    addMovies_col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
    addMovies_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
    addMovies_tableview.setItems(movieList);
    
    //avalibleMovies_tableView.setItems(movieList);
}
   
   

    
    public void addMovie() {
      try {
                                  
                             
        MovieData newMovie = new MovieData(addMovies_MovieTitle.getText(),
                                            addMovies_genre.getText(),
                                            addMovies_duration.getText(),
                                            addMovies_date2.getValue(),
                                            addMovies_ImageView2.getImage(),
                                            editScreening_current.getValue()
                                                     
        );
        
        movieDataList.add(newMovie);
        
        clearMovieFields();
        showMovieList(movieDataList);
        
        showEditScreening(movieDataList);
        showAvalibleMovies(movieDataList);
        //showRecipeMoviesTitle(movieDataList);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Movie added");
        alert.setHeaderText(null);
        alert.setContentText("The movie has been added to the list.");
        alert.showAndWait();
    } catch (Exception e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all the fields correctly.");
        alert.showAndWait();
    }
  }	
    public void updateMovie(){
           int selectedIndex = addMovies_tableview.getSelectionModel().getSelectedIndex();
    if (selectedIndex >= 0) {
        try {
            
            MovieData selectedMovie = addMovies_tableview.getSelectionModel().getSelectedItem();
            
            selectedMovie.setTitle(addMovies_MovieTitle.getText());
            selectedMovie.setGenre(addMovies_genre.getText());
            selectedMovie.setDuration(addMovies_duration.getText());
            selectedMovie.setDate(addMovies_date2.getValue());
            selectedMovie.setImage(addMovies_ImageView2.getImage());
            
            movieDataList.set(selectedIndex, selectedMovie);
            showMovieList(movieDataList);
         
            clearMovieFields();
            Alert info = new Alert(Alert.AlertType.INFORMATION);
            info.setTitle("Movie updated");
            info.setHeaderText(null);
            info.setContentText("The movie has been updated.");
            info.showAndWait();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all the fields correctly.");
            alert.showAndWait();
        }
    } else {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("No Selection");
        alert.setHeaderText(null);
        alert.setContentText("Please select a movie to update.");
        alert.showAndWait();
    }
}
    
    
    public void deleteMovie() {
    int selectedIndex = addMovies_tableview.getSelectionModel().getSelectedIndex();
    if (selectedIndex >= 0) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Movie");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to delete this movie?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            movieDataList.remove(selectedIndex);
            showMovieList(movieDataList);
            clearMovieFields();
            Alert info = new Alert(Alert.AlertType.INFORMATION);
            info.setTitle("Movie deleted");
            info.setHeaderText(null);
            info.setContentText("The movie has been deleted.");
            info.showAndWait();
        }
    } else {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("No Selection");
        alert.setHeaderText(null);
        alert.setContentText("Please select a movie to delete.");
        alert.showAndWait();
    }
}
    private int freq = 0;
    public void totalNumberofMovies(){
        if(editScreening_current.getValue().equals("Showing")){
            freq+=1;
        }else if (editScreening_current.getValue().equals("End Showing") && freq > 0) {
            freq -= 1;
        }
       dashboard_totalMovie.setText(String.valueOf(freq));
    }
    public void editScreeningUpdate(){
        int selectedIndex = editScreening_tableView.getSelectionModel().getSelectedIndex();
    if (selectedIndex >= 0) {
        try {
            
            MovieData selectedMovie = editScreening_tableView.getSelectionModel().getSelectedItem();
                      
                
            selectedMovie.setCurrent(editScreening_current.getValue());
            
            movieDataList.set(selectedIndex, selectedMovie);
            //showMovieList(movieDataList);
            showEditScreening(movieDataList);
            totalNumberofMovies();
         
            clearMovieFields();
            Alert info = new Alert(Alert.AlertType.INFORMATION);
            info.setTitle("Movie updated");
            info.setHeaderText(null);
            info.setContentText("The movie has been updated.");
            info.showAndWait();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all the fields correctly.");
            alert.showAndWait();
        }
    } else {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("No Selection");
        alert.setHeaderText(null);
        alert.setContentText("Please select a movie to update.");
        alert.showAndWait();
    }

 }
      

   
    public void selectAddMoviesList(){
        MovieData movD = addMovies_tableview.getSelectionModel().getSelectedItem();
        int num = addMovies_tableview.getSelectionModel().getSelectedIndex();
        if((num -1)<-1){
            return;
        }
        addMovies_MovieTitle.setText(movD.getTitle());
        addMovies_genre.setText(movD.getGenre());
        addMovies_duration.setText(movD.getDuration());
        addMovies_date2.setValue(movD.getDate());
        addMovies_ImageView2.setImage(movD.getImage());
        //addMovies_ImageView2.setImage(image);
        
    }
    public void selectEditScreening(){
        MovieData movD = editScreening_tableView.getSelectionModel().getSelectedItem();
        int num = editScreening_tableView.getSelectionModel().getSelectedIndex();
        if((num -1)<-1){
            return;
        }
        
        //addMovies_ImageView2.setImage(image);
        //editScreening_current.setItems(movD.getCurrent());
        editScreening_current.setValue(movD.getCurrent());
        editScreening_title.setText(movD.getTitle());
        editScreening_imageView2.setImage(movD.getImage());
    }
    
    public void selectAvalibleMovies(){
        MovieData movD = avalibleMovies_tableView.getSelectionModel().getSelectedItem();
        int num = avalibleMovies_tableView.getSelectionModel().getSelectedIndex();
        if((num -1)<-1){
            return;
        }
        
        //addMovies_ImageView2.setImage(image);
        //editScreening_current.setValue(movD.getCurrent());
        avalibleMovies_movieTitle.setText(movD.getTitle());
        avalibleMovies_genre.setText(movD.getGenre());
        avalibleMovies_date2.setValue(movD.getDate());
        //AvalibleMovie_ImageView.setImage(movD.getImage());
        //editScreening_imageView2.setImage(movD.getImage());
    }
    
    public void clearMovieFields() {
    addMovies_MovieTitle.setText("");
    addMovies_genre.setText("");
    addMovies_duration.setText("");
    addMovies_date2.setValue(null);
    addMovies_ImageView2.setImage(null);
    editScreening_current.setValue(null);
}
    
    public void searchAddMovies(){
        FilteredList<MovieData> filter = new FilteredList<>(movieDataList,e -> true);
        addMovies_search.textProperty().addListener((observable,oldValue,newValue) ->{
              filter.setPredicate(PredicateMoviesData -> {
                  if(newValue == null || newValue.isEmpty()){
                      return true;
                  }
                  String keySearch = newValue.toLowerCase();
                  if(PredicateMoviesData.getTitle().toLowerCase().contains(keySearch)){
                      return true;
                  }
                  return false;
                  
                  
              
              });
        });
        SortedList<MovieData> sortData = new SortedList<>(filter);
        sortData.comparatorProperty().bind(addMovies_tableview.comparatorProperty());
        addMovies_tableview.setItems(sortData);
        
              
    }
    
    
    public void EditsearchAddMovies(){
        FilteredList<MovieData> filter = new FilteredList<>(movieDataList,e -> true);
        editScreening_search.textProperty().addListener((observable,oldValue,newValue) ->{
              filter.setPredicate(PredicateMoviesData -> {
                  if(newValue.isEmpty() || newValue == null){
                      return true;
                  }
                  String keySearch = newValue.toLowerCase();
                  if(PredicateMoviesData.getTitle().toLowerCase().contains(keySearch)){
                      return true;
                  }
                  else if(PredicateMoviesData.getGenre().toLowerCase().contains(keySearch)){
                      return true;
                  }
                  else if(PredicateMoviesData.getDuration().toLowerCase().contains(keySearch)){
                      return true;
                  }
                  else if(PredicateMoviesData.getCurrent().toLowerCase().contains(keySearch)){
                      return true;
                  }else{
                  return false;
                  }
              
              });
        });
        SortedList<MovieData> sortData = new SortedList<>(filter);
        sortData.comparatorProperty().bind(editScreening_tableView.comparatorProperty());
        editScreening_tableView.setItems(sortData);
    
              
    }
    
    public void clearEditScreening(){
        editScreening_title.setText("");
        editScreening_imageView2.setImage(null);
    }
    
    public void SelectAvalibleImageViewMovie(){
        MovieData movD = avalibleMovies_tableView.getSelectionModel().getSelectedItem();
        //int num = avalibleMovies_tableView.getSelectionModel().getSelectedIndex();
        //if((num -1)<-1){
        //    return;
        //}
        
        if(avalibleMovies_movieTitle.getText().isEmpty()|| avalibleMovies_genre.getText().isEmpty()){
            
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select movies first!");
            alert.showAndWait();
        }else{
        AvalibleMovie_ImageView.setImage(movD.getImage());
        avalibleMovies_title.setText(movD.getTitle());
        //recipe_movieTitle_col.setCellValueFactory(new PropertyValueFactory<>("title"));
        
        }
        //Clear Texts
        avalibleMovies_movieTitle.setText("");
        avalibleMovies_genre.setText("");
        avalibleMovies_date2.setValue(null);
        
}
    private SpinnerValueFactory<Integer> spinner1;
    private SpinnerValueFactory<Integer> spinner2;
    private double price1= 0;
    private double price2= 0;
    private double total = 0;
    private double total_all =0;
    private int total_Tickets = 0;
    private int qty1=0;
    private int qty2=0;
    private int Total = 0;
    private int total_Tic = 0;

    public void ShowSpinnerValue(){
        spinner1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
        spinner2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
        avalibleMovies_specialClass_quantity.setValueFactory(spinner1);
        avalibleMovies_normalClass_quantity.setValueFactory(spinner2);
    }
    public void getSpinnerValue(MouseEvent event){
        qty1 = avalibleMovies_specialClass_quantity.getValue();
        qty2 = avalibleMovies_normalClass_quantity.getValue();
        price1 = (qty1 * 25);
        price2 = (qty2 * 10);
        total = price1 + price2;
        total_Tickets = qty1 + qty2;
        //total_all = total_all + total;
        avalibleMovies_specialClass_price.setText("$"+String.valueOf(price1));
        avalibleMovies_normalClass_price.setText("$"+String.valueOf(price2));
        avalibleMovies_total.setText("$"+String.valueOf(total));
        
                
    }
     public void getPriceSum() {
        
        
        total_all = total_all + total;
        recipe_total.setText("$"+total_all);
        dashboard_totalSalary.setText("$"+total_all);
    }
     public void getTotalTickets(){
         total_Tic = total_Tic + total_Tickets;         
         dashboard_totalTicket.setText(String.valueOf(total_Tic));
     }
     
    
    private String[] SeatNumberList = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};    
    ObservableList<String> seatNumberObservableList;

    public void SeatNumberComboBox(){
        
         List<String> listCurrent = new ArrayList<>(Arrays.asList(SeatNumberList));
    avalibleMovies_seatNumber.setItems(FXCollections.observableArrayList(listCurrent));
    
    avalibleMovies_seatNumber.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
        if (newValue != null) {
            listCurrent.remove(newValue);
        }
    });
          
        
    }
    public void selectRecipe(){
        Recipe recipes = recipe_tableview.getSelectionModel().getSelectedItem();
        int num = recipe_tableview.getSelectionModel().getSelectedIndex();
        if((num -1)<-1){
            return;
        }
                       
        //recipes.setDatecheck(LocalDate.now());
        //recipes.setTimecheck(LocalTime.now().toString());
        //recipe_date4.setValue(recipes.getDatecheck());
        recipe_date3.setText(recipes.getDatecheck());
        recipe_time2.setText(recipes.getTimecheck());
     }
                        
    ObservableList<Recipe> RecipesList = FXCollections.observableArrayList();
    public void buy(){
        String type;
        if(price1>0 && price2==0){
            type = "Special Class";
        }else if(price1==0 && price2>0){
            type = "Normal Class";
        }else{
            type = "Special Class & Normal Class";
        }
                  
               
        recipe_type.setText(type);
        recipe_MovieTitle.setText(avalibleMovies_title.getText());
        recipe_Total.setText(avalibleMovies_total.getText());
        
        recipe_date3.setText(LocalDate.now().toString());
        recipe_time2.setText(LocalTime.now().toString());
        //recipe_date4.setValue(LocalDate.now());
        
           
    
        Recipe recipes = new Recipe(recipe_type.getText(),recipe_MovieTitle.getText(),recipe_Total.getText(),avalibleMovies_seatNumber.getValue(),recipe_date3.getText(),recipe_time2.getText());
        RecipesList.add(recipes);
        showRecipeMoviesTitle(RecipesList);
        showCustomer(RecipesList);
        clearRecipe();
        getPriceSum();
        getTotalTickets();
        
     String seatNumber = avalibleMovies_seatNumber.getValue();
     if (seatNumber != null) {
        List<String> listCurrent = new ArrayList<>(Arrays.asList(SeatNumberList));
        listCurrent.remove(seatNumber);
        SeatNumberList = listCurrent.toArray(new String[0]);        
        SeatNumberComboBox();
    }
       
        
        
        if(AvalibleMovie_ImageView.getImage()==null || avalibleMovies_title.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select movie first!");
            alert.showAndWait();
        }else if(price1==0 && price2==0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please Indicate the quantity the ticket!");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Succesfully purchase!");
            alert.showAndWait();
        }
        //MovieData newMovie = new MovieData();
        
        //showRecipeMoviesTitle();
        
    }
    public void ClearTicketPurchaseInfo(){
        spinner1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
        spinner2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
        avalibleMovies_specialClass_quantity.setValueFactory(spinner1);
        avalibleMovies_normalClass_quantity.setValueFactory(spinner2);
        avalibleMovies_specialClass_price.setText("$0.0");
        avalibleMovies_normalClass_price.setText("$0.0");
        avalibleMovies_total.setText("$0.0");
        avalibleMovies_seatNumber.setValue(null);
        
    }
    public void showRecipeMoviesTitle(ObservableList<Recipe> recipeList){
        
        recipe_type_col.setCellValueFactory(new PropertyValueFactory<>("type"));
        recipe_movieTitle_col.setCellValueFactory(new PropertyValueFactory<>("movieTitle"));
        recipe_Total_col.setCellValueFactory(new PropertyValueFactory<>("total"));
        recipe_seatNumber_col.setCellValueFactory(new PropertyValueFactory<>("seatNumber"));
        recipe_tableview.setItems(recipeList);
        
    }
    public void clearRecipe(){
        recipe_type.setText("");
        recipe_MovieTitle.setText("");
        recipe_Total.setText("");
    }
    
    public void showCustomer(ObservableList<Recipe> recipes){
        customers_col_ticketNumber.setCellValueFactory(new PropertyValueFactory<>("seatNumber"));
        customers_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("movieTitle"));
        customers_col_genre.setCellValueFactory(new PropertyValueFactory<>("type"));
        customers_col_date.setCellValueFactory(new PropertyValueFactory<>("datecheck"));
        customers_col_time.setCellValueFactory(new PropertyValueFactory<>("timecheck"));

        customers_tableView.setItems(recipes);
    }
    public void selectCustomer(){
        Recipe recipes = customers_tableView.getSelectionModel().getSelectedItem();
        int num = customers_tableView.getSelectionModel().getSelectedIndex();
        if((num -1)<-1){
            return;
        }
                
        customers_ticketNumber.setText(recipes.getSeatNumber());
        customers_movieTitle.setText(recipes.getMovieTitle());
        customers_genre.setText(recipes.getType());
        customers_time.setText(recipes.getTimecheck());
        customers_date.setText(recipes.getDatecheck());
        
    }
    
    public void clearCustomerFields() {
    customers_ticketNumber.setText("");
    customers_movieTitle.setText("");
    customers_genre.setText("");
    customers_time.setText("");
    customers_date.setText("");
}
    public void deleteCustomer() {
    int selectedIndex = customers_tableView.getSelectionModel().getSelectedIndex();
    if (selectedIndex >= 0) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Movie");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to delete this movie?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            RecipesList.remove(selectedIndex);
            showCustomer(RecipesList);
            clearCustomerFields();
            Alert info = new Alert(Alert.AlertType.INFORMATION);
            info.setTitle("Movie deleted");
            info.setHeaderText(null);
            info.setContentText("The movie has been deleted.");
            info.showAndWait();
        }
    } else {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("No Selection");
        alert.setHeaderText(null);
        alert.setContentText("Please select a movie to delete.");
        alert.showAndWait();
    }
   }
    
    
    public void searchCustomer(){
        FilteredList<Recipe> filter = new FilteredList<>(RecipesList,e -> true);
        customers_search.textProperty().addListener((observable,oldValue,newValue) ->{
              filter.setPredicate(PredicateMoviesData -> {
                  if(newValue.isEmpty() || newValue == null){
                      return true;
                  }
                  String keySearch = newValue.toLowerCase();
                  if(PredicateMoviesData.getMovieTitle().toLowerCase().contains(keySearch)){
                      return true;
                  }
                  else if(PredicateMoviesData.getSeatNumber().toLowerCase().contains(keySearch)){
                      return true;
                  }
                  else if(PredicateMoviesData.getType().toLowerCase().contains(keySearch)){
                      return true;
                  }
                  return false;
              
              });
        });
        SortedList<Recipe> sortData = new SortedList<>(filter);
        sortData.comparatorProperty().bind(customers_tableView.comparatorProperty());
        customers_tableView.setItems(sortData);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         addMovies_insertBtn.setOnAction(event -> addMovie());   		
	 // connect the addMovies_updateBtn button to the updateMovie() method
    addMovies_updateBtn.setOnAction(event -> updateMovie());

    // connect the addMovies_deleteBtn button to the deleteMovie() method
    addMovies_deleteBtn.setOnAction(event -> deleteMovie());

    // connect the addMovies_clearBtn button to the clearMovieFields() method
    addMovies_clearBtn.setOnAction(event -> clearMovieFields());
	
      comboBox();
      
     editScreening_updateBtn.setOnAction(event -> editScreeningUpdate());
     
     avalibleMovies_selectMovieBtn.setOnAction(event -> SelectAvalibleImageViewMovie());
     
     ShowSpinnerValue();
     
     SeatNumberComboBox();
     avalibleMovies_buyBtn.setOnAction(event -> buy());
     
     customers_deleteBtn.setOnAction(event -> deleteCustomer());
     customers_clearBtn.setOnAction(event -> clearCustomerFields());

     
     //getRecipeticketNumber();
    }
}
