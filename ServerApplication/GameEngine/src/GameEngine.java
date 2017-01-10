class GameEngine {

   private List<TickListener> listeners;

   GameEngine() {
      this.listeners = new ArrayList<TickListener>();
   }

   public tick() {

      //TickInfo info = ...

      for(Iterator<TickListener> module_i = this.listeners.iterator(); module_i.hasNext();) {
         module_i.onTick(info);
      }

   }

   public addTickListener(TickListener l) {
      this.listeners.add(l);
   }

}