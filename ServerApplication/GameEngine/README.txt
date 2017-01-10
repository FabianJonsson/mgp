Pseudo code

GameEngine
----------

private Array<TickListener> listeners;

public void tick():

parfor each this.listeners as l
   l.onTick();