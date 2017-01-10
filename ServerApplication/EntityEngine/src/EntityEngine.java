import GameEngine.TickListener
import GameEngine.TickInfo

class EntityEngine implements TickListener {

   EntityEngine(GameEngine game) {
      game.addTickListener(this);
   }

   public onTick(TickInfo info) {
   }

}
