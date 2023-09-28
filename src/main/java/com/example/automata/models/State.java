package com.example.automata.models;

import javafx.scene.shape.Circle;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class State {

    @NonNull
    private Circle circle;

    @NonNull
    private Character[] transition;

    private State[] possibleState;
    private Boolean success;
    private Boolean end = Boolean.FALSE;
}
