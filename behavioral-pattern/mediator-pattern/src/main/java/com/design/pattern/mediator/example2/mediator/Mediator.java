package com.design.pattern.mediator.example2.mediator;

import com.design.pattern.mediator.example2.components.Component;

import javax.swing.ListModel;

/**
 * Mediator
 * <p>
 * Common mediator interface.
 *
 * @author Wenzhou
 * @since 2023/6/1 13:40
 */
public interface Mediator {
    void addNewNote(Note note);

    void deleteNote();

    void getInfoFromList(Note note);

    void saveChanges();

    void markNote();

    void clear();

    void sendToFilter(ListModel listModel);

    void setElementsList(ListModel list);

    void registerComponent(Component component);

    void hideElements(boolean flag);

    void createGUI();
}
