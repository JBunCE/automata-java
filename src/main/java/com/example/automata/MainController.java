package com.example.automata;

import com.example.automata.models.State;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML private Pane root;

    @FXML private Circle q0;
    @FXML private Circle q1;
    @FXML private Circle q2;
    @FXML private Circle q3;
    @FXML private Circle q4;
    @FXML private Circle q5;
    @FXML private Circle q6;
    @FXML private Circle q7;
    @FXML private Circle q8;
    @FXML private Circle q9;
    @FXML private Circle q10;
    @FXML private Circle q11;
    @FXML private Circle q12;
    @FXML private Circle q13;
    @FXML private Circle q14;
    @FXML private Circle q15;
    @FXML private Circle q16;
    @FXML private Circle q17;
    @FXML private Circle q18;
    @FXML private Circle q19;
    @FXML private Circle q20;
    @FXML private Circle q21;
    @FXML private Circle q22;
    @FXML private Circle q23;
    @FXML private Circle q24;
    @FXML private Circle q25;
    @FXML private Circle q26;
    @FXML private Circle q27;
    @FXML private Circle q28;
    @FXML private Circle q29;
    @FXML private Circle q30;
    @FXML private Circle q31;
    @FXML private Circle q32;
    @FXML private Circle q33;
    @FXML private Circle q34;
    @FXML private Circle q35;
    @FXML private Circle q36;
    @FXML private Circle q37;
    @FXML private Circle q38;
    @FXML private Circle q39;
    @FXML private Circle q40;
    @FXML private Circle q41;
    @FXML private Circle q42;
    @FXML private Circle q43;
    @FXML private Circle q44;
    @FXML private Circle q45;
    @FXML private Circle q46;
    @FXML private Circle q47;
    @FXML private Circle q48;
    @FXML private Circle q49;
    @FXML private Circle q50;
    @FXML private Circle q51;
    @FXML private Circle q52;
    @FXML private Circle q53;
    @FXML private Circle q54;
    @FXML private Circle q55;
    @FXML private Circle q56;
    @FXML private Circle q57;
    @FXML private Circle q58;
    @FXML private Circle q59;
    @FXML private Circle q60;
    @FXML private Circle q61;
    @FXML private Circle q62;
    @FXML private Circle q63;
    @FXML private Circle q64;
    @FXML private Circle q65;
    @FXML private Circle q66;
    @FXML private Circle q67;
    @FXML private Circle q68;
    @FXML private Circle q69;
    @FXML private Circle q70;
    @FXML private Circle q71;
    @FXML private Circle q72;
    @FXML private Circle q73;
    @FXML private Circle q74;
    @FXML private Circle q75;
    @FXML private Circle q76;
    @FXML private Circle q77;
    @FXML private Circle q78;
    @FXML private Circle q79;

    @FXML
    private TextField entry;

    private State stateQ0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // possible final state success state on q12
        stateQ0 = new State(q0, new Character[]{'1', '2'});
        State stateQ1 = new State(q1, new Character[]{'9', '8'});
        State stateQ2 = new State(q2, new Character[]{'5'});
        State stateQ3 = new State(q3, new Character[]{'/'});
        State stateQ4 = new State(q4, new Character[]{'6'});
        State stateQ5 = new State(q5, new Character[]{'0'});
        State stateQ6 = new State(q6, new Character[]{'R'});
        State stateQ7 = new State(q7, new Character[]{'1'});
        State stateQ8 = new State(q8, new Character[]{'5'});
        State stateQ9 = new State(q9, new Character[]{'8'});
        State stateQ10 = new State(q10, new Character[]{'8'});

        // possible final state success state on q12
        State stateQ13 = new State(q13, new Character[]{'5'});
        State stateQ14 = new State(q14, new Character[]{'/'});
        State stateQ15 = new State(q15, new Character[]{'5'});
        State stateQ16 = new State(q16, new Character[]{'5'});
        State stateQ17 = new State(q17, new Character[]{'R'});
        State stateQ18 = new State(q18, new Character[]{'1'});
        State stateQ19 = new State(q19, new Character[]{'6'});
        State stateQ20 = new State(q20, new Character[]{'8'});
        State stateQ21 = new State(q21, new Character[]{'3'});

        // possible final state success on q12 or q39
        State stateQ22 = new State(q22, new Character[]{'1', '0', '2', '7', '8'});
        State stateQ23 = new State(q23, new Character[]{'5'});
        State stateQ24 = new State(q24, new Character[]{'/'});
        State stateQ25 = new State(q25, new Character[]{'5', '4'});
        State stateQ26 = new State(q26, new Character[]{'5'});
        State stateQ27 = new State(q27, new Character[]{'R'});
        State stateQ28 = new State(q28, new Character[]{'1'});
        State stateQ29 = new State(q29, new Character[]{'7'});
        State stateQ30 = new State(q30, new Character[]{'9'});
        State stateQ31 = new State(q31, new Character[]{'4'});

        // possible final state success on q39
        State stateQ32 = new State(q32, new Character[]{'5'});
        State stateQ33 = new State(q33, new Character[]{'R'});
        State stateQ34 = new State(q34, new Character[]{'1'});
        State stateQ35 = new State(q35, new Character[]{'6', '8'});
        State stateQ36 = new State(q36, new Character[]{'9'});
        State stateQ37 = new State(q37, new Character[]{'0'});

        // possible final state success on q39
        State stateQ40 = new State(q40, new Character[]{'8'});
        State stateQ41 = new State(q41, new Character[]{'9'});

        // possible final state success on q39
        State stateQ42 = new State(q42, new Character[]{'5'});
        State stateQ43 = new State(q43, new Character[]{'/'});
        State stateQ44 = new State(q44, new Character[]{'5'});
        State stateQ45 = new State(q45, new Character[]{'0'});
        State stateQ46 = new State(q46, new Character[]{'R'});
        State stateQ47 = new State(q47, new Character[]{'1'});
        State stateQ48 = new State(q48, new Character[]{'7'});

        // possible final state success on q39
        State stateQ49 = new State(q49, new Character[]{'5'});
        State stateQ50 = new State(q50, new Character[]{'/'});
        State stateQ51 = new State(q51, new Character[]{'5'});
        State stateQ52 = new State(q52, new Character[]{'5'});
        State stateQ53 = new State(q53, new Character[]{'R'});
        State stateQ54 = new State(q54, new Character[]{'1'});
        State stateQ55 = new State(q55, new Character[]{'7'});
        State stateQ56 = new State(q56, new Character[]{'9'});
        State stateQ57 = new State(q57, new Character[]{'5'});

        // possible final state success on q69
        State stateQ58 = new State(q58, new Character[]{'5'});
        State stateQ59 = new State(q59, new Character[]{'/'});
        State stateQ60 = new State(q60, new Character[]{'5'});
        State stateQ61 = new State(q61, new Character[]{'5'});
        State stateQ62 = new State(q62, new Character[]{'R'});
        State stateQ63 = new State(q63, new Character[]{'2'});
        State stateQ64 = new State(q64, new Character[]{'0'});
        State stateQ65 = new State(q65, new Character[]{'1'});
        State stateQ66 = new State(q66, new Character[]{'1'});
        State stateQ67 = new State(q67, new Character[]{'3'});

        // possible final state success on q69
        State stateQ70 = new State(q70, new Character[]{'5'});
        State stateQ71 = new State(q71, new Character[]{'/'});
        State stateQ72 = new State(q72, new Character[]{'6'});
        State stateQ73 = new State(q73, new Character[]{'0'});
        State stateQ74 = new State(q74, new Character[]{'R'});
        State stateQ75 = new State(q75, new Character[]{'1'});
        State stateQ76 = new State(q76, new Character[]{'8'});
        State stateQ77 = new State(q77, new Character[]{'1'});
        State stateQ78 = new State(q78, new Character[]{'2'});
        State stateQ79 = new State(q79, new Character[]{'0'});

        // final q12
        State stateQ11 = new State(q11, new Character[]{'V'});
        State stateQ12 = new State(q12, new Character[]{});

        // final q38
        State stateQ38 = new State(q38, new Character[]{'W'});
        State stateQ39 = new State(q39, new Character[]{'1'});

        // final q69
        State stateQ68 = new State(q68, new Character[]{'H'});
        State stateQ69 = new State(q69, new Character[]{'1'});

        stateQ0.setPossibleState(new State[]{stateQ1, stateQ22});
        stateQ1.setPossibleState(new State[]{stateQ2, stateQ13});
        stateQ2.setPossibleState(new State[]{stateQ3});
        stateQ3.setPossibleState(new State[]{stateQ4});
        stateQ4.setPossibleState(new State[]{stateQ5});
        stateQ5.setPossibleState(new State[]{stateQ6});
        stateQ6.setPossibleState(new State[]{stateQ7});
        stateQ7.setPossibleState(new State[]{stateQ8});
        stateQ8.setPossibleState(new State[]{stateQ9});
        stateQ9.setPossibleState(new State[]{stateQ10});
        stateQ10.setPossibleState(new State[]{stateQ11});

        stateQ13.setPossibleState(new State[]{stateQ14});
        stateQ14.setPossibleState(new State[]{stateQ15});
        stateQ15.setPossibleState(new State[]{stateQ16});
        stateQ16.setPossibleState(new State[]{stateQ17});
        stateQ17.setPossibleState(new State[]{stateQ18});
        stateQ18.setPossibleState(new State[]{stateQ19});
        stateQ19.setPossibleState(new State[]{stateQ20});
        stateQ20.setPossibleState(new State[]{stateQ21});
        stateQ21.setPossibleState(new State[]{stateQ11});

        stateQ22.setPossibleState(new State[]{stateQ23, stateQ42, stateQ49, stateQ58, stateQ70});
        stateQ23.setPossibleState(new State[]{stateQ24});
        stateQ24.setPossibleState(new State[]{stateQ25});
        stateQ25.setPossibleState(new State[]{stateQ26, stateQ32});
        stateQ26.setPossibleState(new State[]{stateQ27});
        stateQ27.setPossibleState(new State[]{stateQ28});
        stateQ28.setPossibleState(new State[]{stateQ29});
        stateQ29.setPossibleState(new State[]{stateQ30});
        stateQ30.setPossibleState(new State[]{stateQ31});
        stateQ31.setPossibleState(new State[]{stateQ11});

        stateQ32.setPossibleState(new State[]{stateQ33});
        stateQ33.setPossibleState(new State[]{stateQ34});
        stateQ34.setPossibleState(new State[]{stateQ35});
        stateQ35.setPossibleState(new State[]{stateQ36, stateQ40});
        stateQ36.setPossibleState(new State[]{stateQ37});
        stateQ37.setPossibleState(new State[]{stateQ38});

        stateQ40.setPossibleState(new State[]{stateQ41});
        stateQ41.setPossibleState(new State[]{stateQ38});

        stateQ42.setPossibleState(new State[]{stateQ43});
        stateQ43.setPossibleState(new State[]{stateQ44});
        stateQ44.setPossibleState(new State[]{stateQ45});
        stateQ45.setPossibleState(new State[]{stateQ46});
        stateQ46.setPossibleState(new State[]{stateQ47});
        stateQ47.setPossibleState(new State[]{stateQ48});
        stateQ48.setPossibleState(new State[]{stateQ40});

        stateQ49.setPossibleState(new State[]{stateQ50});
        stateQ50.setPossibleState(new State[]{stateQ51});
        stateQ51.setPossibleState(new State[]{stateQ52});
        stateQ52.setPossibleState(new State[]{stateQ53});
        stateQ53.setPossibleState(new State[]{stateQ54});
        stateQ54.setPossibleState(new State[]{stateQ55});
        stateQ55.setPossibleState(new State[]{stateQ56});
        stateQ56.setPossibleState(new State[]{stateQ57});
        stateQ57.setPossibleState(new State[]{stateQ11});

        stateQ58.setPossibleState(new State[]{stateQ59});
        stateQ59.setPossibleState(new State[]{stateQ60});
        stateQ60.setPossibleState(new State[]{stateQ61});
        stateQ61.setPossibleState(new State[]{stateQ62});
        stateQ62.setPossibleState(new State[]{stateQ63});
        stateQ63.setPossibleState(new State[]{stateQ64});
        stateQ64.setPossibleState(new State[]{stateQ65});
        stateQ65.setPossibleState(new State[]{stateQ66});
        stateQ66.setPossibleState(new State[]{stateQ67});
        stateQ67.setPossibleState(new State[]{stateQ68});

        stateQ70.setPossibleState(new State[]{stateQ71});
        stateQ71.setPossibleState(new State[]{stateQ72});
        stateQ72.setPossibleState(new State[]{stateQ73});
        stateQ73.setPossibleState(new State[]{stateQ74});
        stateQ74.setPossibleState(new State[]{stateQ75});
        stateQ75.setPossibleState(new State[]{stateQ76});
        stateQ76.setPossibleState(new State[]{stateQ77});
        stateQ77.setPossibleState(new State[]{stateQ78});
        stateQ78.setPossibleState(new State[]{stateQ79});
        stateQ79.setPossibleState(new State[]{stateQ68});

        stateQ12.setEnd(Boolean.TRUE);
        stateQ11.setPossibleState(new State[]{stateQ12});


        stateQ39.setEnd(Boolean.TRUE);
        stateQ38.setPossibleState(new State[]{stateQ39});


        stateQ69.setEnd(Boolean.TRUE);
        stateQ68.setPossibleState(new State[]{stateQ69});
    }

    @FXML
    protected void onStartButtonClick() {
        TransitionThread transitionThread = new TransitionThread();
        String entryString = entry.getText();
        ArrayList<Character> entryCharList = new ArrayList<>(entryString.chars().mapToObj(c -> ((char) c)).toList());
        transitionThread.setSequence(() -> evaluation(entryCharList, stateQ0));
        transitionThread.start();
    }

    @FXML
    protected void onCleanButtonClick() {
        for (int i = 0; i <= 79; i++) {
            String id = "q" + i;
            Node node = root.lookup("#" +id);
            if (node instanceof Shape) {
                ((Shape) node).setFill(Paint.valueOf("#bcdeff"));
            }
        }
    }

    private State evaluation(ArrayList<Character> characterList, State state) throws InterruptedException {
        if (characterList.isEmpty() && state.getEnd()) {
            state.getCircle().setFill(Paint.valueOf("#4dfa92"));
            return state;
        }

        else if (state.getEnd()) {
            state.getCircle().setFill(Paint.valueOf("#e44f4f"));
            return state;
        }

        Character character = characterList.remove(0);

        for (int transIndex = 0; transIndex < state.getTransition().length; transIndex++) {
            if (state.getTransition()[transIndex].equals(character)) {
                state.getCircle().setFill(Paint.valueOf("#4dfa92"));
                state.setSuccess(Boolean.TRUE);
                Thread.sleep(500);
                return evaluation(characterList, state.getPossibleState()[transIndex]);
            }
        }

        state.getCircle().setFill(Paint.valueOf("#e44f4f"));
        state.setSuccess(Boolean.FALSE);
        return state;
    }
}