/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myah.quizApp;

import com.codename1.io.Storage;
import static com.codename1.ui.CN.*;
import java.io.IOException;
import java.io.OutputStream;

/**
 * GUI builder created Form
 *
 * @author Myah
 */
public class SignUp extends com.codename1.ui.Form {

    public SignUp() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public SignUp(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.TextField gui_Text_Field = new com.codename1.ui.TextField();
    private com.codename1.ui.TextField gui_Text_Field_1 = new com.codename1.ui.TextField();
    private com.codename1.ui.TextField gui_Text_Field_2 = new com.codename1.ui.TextField();
    private com.codename1.ui.TextField gui_Text_Field_3 = new com.codename1.ui.TextField();
    private com.codename1.ui.TextField gui_Text_Field_4 = new com.codename1.ui.TextField();
    private com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();
    private com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button.addActionListener(callback);
        gui_Button_1.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();

            if(sourceComponent.getParent().getLeadParent() != null && (sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.MultiButton || sourceComponent.getParent().getLeadParent() instanceof com.codename1.components.SpanButton)) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_Button) {
                onButtonActionEvent(ev);
            }
            if(sourceComponent == gui_Button_1) {
                onButton_1ActionEvent(ev);
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(false);
                setInlineStylesTheme(resourceObjectInstance);
        setInlineAllStyles("margin:5.0mm 2.0mm 10.0mm 5.0mm;");
        setTitle("Sign Up");
        setName("SignUp");
        addComponent(gui_Text_Field);
        addComponent(gui_Text_Field_1);
        addComponent(gui_Text_Field_2);
        addComponent(gui_Text_Field_3);
        addComponent(gui_Text_Field_4);
        addComponent(gui_Button);
        addComponent(gui_Button_1);
        addComponent(gui_Label);
        gui_Text_Field.setHint("Surname");
                gui_Text_Field.setInlineStylesTheme(resourceObjectInstance);
        gui_Text_Field.setName("Text_Field");
        gui_Text_Field.setHintIcon(com.codename1.ui.FontImage.createMaterial("\ue7fd".charAt(0), gui_Text_Field.getUnselectedStyle()));
        ((com.codename1.ui.layouts.LayeredLayout)gui_Text_Field.getParent().getLayout()).setInsets(gui_Text_Field, "1.5mm auto auto auto").setReferenceComponents(gui_Text_Field, "-1 -1 -1 -1").setReferencePositions(gui_Text_Field, "0.0 0.0 0.0 0.0");
        gui_Text_Field_1.setHint("First Name");
                gui_Text_Field_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Text_Field_1.setName("Text_Field_1");
        gui_Text_Field_1.setHintIcon(com.codename1.ui.FontImage.createMaterial("\ue7fd".charAt(0), gui_Text_Field_1.getUnselectedStyle()));
        ((com.codename1.ui.layouts.LayeredLayout)gui_Text_Field_1.getParent().getLayout()).setInsets(gui_Text_Field_1, "1.0mm auto auto 0.0mm").setReferenceComponents(gui_Text_Field_1, "0 -1 -1 0 ").setReferencePositions(gui_Text_Field_1, "1.0 0.0 0.0 0.0");
        gui_Text_Field_2.setPreferredSizeStr("55.026455mm inherit");
        gui_Text_Field_2.setHint("Username");
                gui_Text_Field_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Text_Field_2.setName("Text_Field_2");
        gui_Text_Field_2.setHintIcon(com.codename1.ui.FontImage.createMaterial("\ue7fd".charAt(0), gui_Text_Field_2.getUnselectedStyle()));
        ((com.codename1.ui.layouts.LayeredLayout)gui_Text_Field_2.getParent().getLayout()).setInsets(gui_Text_Field_2, "1.0mm auto auto 0.0mm").setReferenceComponents(gui_Text_Field_2, "1 0 -1 0 ").setReferencePositions(gui_Text_Field_2, "1.0 0.0 0.0 0.0");
        gui_Text_Field_3.setPreferredSizeStr("55.026455mm inherit");
        gui_Text_Field_3.setHint("Password");
                gui_Text_Field_3.setInlineStylesTheme(resourceObjectInstance);
        gui_Text_Field_3.setName("Text_Field_3");
        gui_Text_Field_3.setHintIcon(com.codename1.ui.FontImage.createMaterial("\ue897".charAt(0), gui_Text_Field_3.getUnselectedStyle()));
        ((com.codename1.ui.layouts.LayeredLayout)gui_Text_Field_3.getParent().getLayout()).setInsets(gui_Text_Field_3, "1.0mm auto auto 0.0mm").setReferenceComponents(gui_Text_Field_3, "2 0 -1 0 ").setReferencePositions(gui_Text_Field_3, "1.0 0.0 0.0 0.0");
        gui_Text_Field_4.setPreferredSizeStr("55.820107mm inherit");
        gui_Text_Field_4.setHint("Confirm Password");
                gui_Text_Field_4.setInlineStylesTheme(resourceObjectInstance);
        gui_Text_Field_4.setName("Text_Field_4");
        gui_Text_Field_4.setHintIcon(com.codename1.ui.FontImage.createMaterial("\ue897".charAt(0), gui_Text_Field_4.getUnselectedStyle()));
        ((com.codename1.ui.layouts.LayeredLayout)gui_Text_Field_4.getParent().getLayout()).setInsets(gui_Text_Field_4, "1.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_Text_Field_4, "3 0 -1 0 ").setReferencePositions(gui_Text_Field_4, "1.0 0.0 0.0 0.0");
        gui_Button.setPreferredSizeStr("55.291004mm inherit");
        gui_Button.setText("Sign Up");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setName("Button");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "1.0mm auto auto 0.0mm").setReferenceComponents(gui_Button, "4 0 -1 0 ").setReferencePositions(gui_Button, "1.0 0.0 0.0 0.0");
        gui_Button_1.setPreferredSizeStr("54.761906mm inherit");
        gui_Button_1.setText("Back");
                gui_Button_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_1.setName("Button_1");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_1.getParent().getLayout()).setInsets(gui_Button_1, "1.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_Button_1, "5 0 -1 0 ").setReferencePositions(gui_Button_1, "1.0 0.0 0.0 0.0");
        gui_Label.setPreferredSizeStr("55.555557mm 13.227513mm");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "3.4391534mm 0.0mm 4.7619047mm 0.0mm").setReferenceComponents(gui_Label, "6 1 -1 0 ").setReferencePositions(gui_Label, "1.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onButton_1ActionEvent(com.codename1.ui.events.ActionEvent ev) {
        Login login = new Login();
        login.showBack();
    }

    public void onButtonActionEvent(com.codename1.ui.events.ActionEvent ev) {
        try (OutputStream os = Storage.getInstance().createOutputStream(gui_Text_Field.getText())){
                   
            Storage.getInstance().writeObject("userinfo", os);
        }
        catch (IOException err){
        }
    }

}
