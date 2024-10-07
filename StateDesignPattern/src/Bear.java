public class Bear {

  public enum State {
    SLEEPING{
      @Override
      public void attack(Bear b) {
        System.out.println("zzz");
      }

      @Override
      public void sleep(Bear b) {
        throw new RuntimeException("already sleeping");
      }
    },
    NOT_SLEEPING{
      @Override
      public void attack(Bear b) {
        System.out.println("grqsd");
      }

      @Override
      public void wakeup(Bear b) {
        throw new RuntimeException("already woke up");
      }
    };

    public abstract void attack(Bear b);

    public void sleep(Bear b) {
      b.setState(State.SLEEPING);
    }

    public void wakeup(Bear b) {
      b.setState(State.NOT_SLEEPING);
    }
  }
  private State state;

  public Bear() {
    setState(State.NOT_SLEEPING);
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void attack() {
    state.attack(this);
  }

  public void sleep() {
    state.sleep(this);
  }

  public void wakeup() {
    state.wakeup(this);
  }

  public static void main(String[] args) {
    Bear bear = new Bear();
    bear.attack();
    bear.sleep();
    bear.attack();
    bear.wakeup();
    bear.attack();
  }
}
