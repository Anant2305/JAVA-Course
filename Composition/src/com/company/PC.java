package com.company;

public class PC  {

    private Case theCase;
    private Monitor monitor;
    private Motherboard montherboard;

    public PC(Case theCase, Monitor monitor, Motherboard montherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.montherboard = montherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "Yellow");
    }

}
