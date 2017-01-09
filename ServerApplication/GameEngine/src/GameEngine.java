class GameEngine {

   private List<TickListener> listeners;

   public tick() {
	// loop over listeners and call onTick(TickInfo)
   }

   public addTickListener(TickListener l) {
      this.listeners.add(l);
   }

}