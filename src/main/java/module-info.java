module com.morp.box.morpbigbox {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.morp.box.morpbigbox to javafx.fxml;
    exports com.morp.box.morpbigbox;
}