module com.example.javaassfelipecayres {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;


    opens com.example.javaassfelipecayres to javafx.fxml;
    exports com.example.javaassfelipecayres;
}