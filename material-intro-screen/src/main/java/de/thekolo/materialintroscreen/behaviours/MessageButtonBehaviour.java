package de.thekolo.materialintroscreen.behaviours;

import de.thekolo.materialintroscreen.listeners.click.MessageButtonClickListener;

@SuppressWarnings("unused")
public class MessageButtonBehaviour {

    private MessageButtonClickListener clickListener;
    private String messageButtonText;

    public MessageButtonBehaviour(MessageButtonClickListener clickListener, String messageButtonText) {
        this.clickListener = clickListener;
        this.messageButtonText = messageButtonText;
    }

    public MessageButtonBehaviour(String messageButtonText) {
        this.messageButtonText = messageButtonText;
    }

    public MessageButtonClickListener getClickListener() {
        return clickListener;
    }

    public String getMessageButtonText() {
        return messageButtonText;
    }
}
