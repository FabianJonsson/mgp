import GameEngine.TickListener
import GameEngine.TickInfo

class GameEnginePerformanceAnalyzer implements TickListener {

   GameEnginePerformanceAnalyzer(GameEngine game) {
      game.addTickListener(this);
   }

   public onTick(TickInfo info) {
   }

}
