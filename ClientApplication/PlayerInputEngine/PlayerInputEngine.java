import GameEngine.TickListener
import GameEngine.TickInfo

class PlayerInputEngine implements TickListener {

   PlayerInputEngine(GameEngine game) {
      game.addTickListener(this);
   }

   public onTick(TickInfo info) {
   }

}
