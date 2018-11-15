/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myah.quizApp;

/**
 * GUI builder created Form
 *
 * @author Myah
 */
public class Login extends com.codename1.ui.Form {

    public Login() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public Login(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    private com.codename1.ui.TextField gui_Text_Field = new com.codename1.ui.TextField();
    private com.codename1.ui.TextField gui_Text_Field_1 = new com.codename1.ui.TextField();
    private com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();
    private com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
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
        setInlineAllStyles("margin:5.0mm 5.0mm 10.0mm 5.0mm;");
        setTitle("Start Up Page");
        setName("Login");
        ((com.codename1.ui.layouts.LayeredLayout)getLayout()).setPreferredWidthMM((float)180.0);
        ((com.codename1.ui.layouts.LayeredLayout)getLayout()).setPreferredHeightMM((float)90.0);
        addComponent(gui_Label);
        addComponent(gui_Text_Field);
        addComponent(gui_Text_Field_1);
        addComponent(gui_Button);
        addComponent(gui_Button_1);
        addComponent(gui_Label_1);
        gui_Label.setPreferredSizeStr("inherit 22.751324mm");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        gui_Label.setIcon(resourceObjectInstance.getImage("quizbig.png"));
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "0.0mm auto 80.91027% auto").setReferenceComponents(gui_Label, "-1 -1 -1 -1").setReferencePositions(gui_Label, "0.0 0.0 0.0 0.0");
        gui_Text_Field.setPreferredSizeStr("61.640213mm inherit");
        gui_Text_Field.setHint("Username");
                gui_Text_Field.setInlineStylesTheme(resourceObjectInstance);
        gui_Text_Field.setName("Text_Field");
        gui_Text_Field.setHintIcon(com.codename1.ui.FontImage.createMaterial("\ue7fd".charAt(0), gui_Text_Field.getUnselectedStyle()));
        ((com.codename1.ui.layouts.LayeredLayout)gui_Text_Field.getParent().getLayout()).setInsets(gui_Text_Field, "5.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_Text_Field, "0 0 -1 0 ").setReferencePositions(gui_Text_Field, "1.0 0.0 0.0 0.0");
        gui_Text_Field_1.setHint("Password");
                gui_Text_Field_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Text_Field_1.setName("Text_Field_1");
        gui_Text_Field_1.setHintIcon(com.codename1.ui.FontImage.createMaterial("\ue897".charAt(0), gui_Text_Field_1.getUnselectedStyle()));
        ((com.codename1.ui.layouts.LayeredLayout)gui_Text_Field_1.getParent().getLayout()).setInsets(gui_Text_Field_1, "2.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_Text_Field_1, "1 1 -1 0 ").setReferencePositions(gui_Text_Field_1, "1.0 0.0 0.0 0.0");
        gui_Button.setPreferredSizeStr("52.645504mm 8.994709mm");
        gui_Button.setText("Login");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setName("Button");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "3.968254mm auto auto auto").setReferenceComponents(gui_Button, "2 2 -1 2 ").setReferencePositions(gui_Button, "1.0 0.0 0.0 0.0");
        gui_Button_1.setPreferredSizeStr("53.968254mm 8.201058mm");
        gui_Button_1.setText("Sign Up");
                gui_Button_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_1.setName("Button_1");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_1.getParent().getLayout()).setInsets(gui_Button_1, "2.910053mm auto auto 0.0mm").setReferenceComponents(gui_Button_1, "3 -1 -1 3 ").setReferencePositions(gui_Button_1, "1.0 0.0 0.0 0.0");
        gui_Label_1.setPreferredSizeStr("68.25397mm 3.7037036mm");
        gui_Label_1.setText(" ");
                gui_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_1.setName("Label_1");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_1.getParent().getLayout()).setInsets(gui_Label_1, "0.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_Label_1, "4 0 -1 0 ").setReferencePositions(gui_Label_1, "1.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onButton_1ActionEvent(com.codename1.ui.events.ActionEvent ev) {
        SignUp signUp = new SignUp();
        signUp.show();
    }

}
