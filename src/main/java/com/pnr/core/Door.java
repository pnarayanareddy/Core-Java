package main.java.com.pnr.core;

public class Door
{
  enum DoorStates { OPEN, CLOSED, MOVINGUP, MOVINGDOWN, PAUSED }

  public static String run (String events)
  {
    int count = 0;
    StringBuilder result = new StringBuilder ();
    DoorStates currentState = DoorStates.CLOSED;
    DoorStates lastMovingState = DoorStates.MOVINGUP;

    for (char c:events.toCharArray ())
  {


    switch (currentState)
      {
      case OPEN:
          if (c == 'P') {
            currentState = DoorStates.MOVINGDOWN;
            count--;
          }
          // do nothing for O and .
        break;

      case CLOSED:
          if (c == 'P') {
              currentState = DoorStates.MOVINGUP;
              count = 1;
          }
          // do nothing for O and .
          break;

      case MOVINGUP: // movingup
          if (c == 'P') {
              currentState = DoorStates.PAUSED; // paused
          } else if (c == 'O') {
              currentState = DoorStates.MOVINGDOWN; // movingdown
              count--;
          } else {
              if (count < 5) {
                  count++;
              }
              if (count == 5) {
                  currentState = DoorStates.OPEN; // open
              }
          }
          break;


      case MOVINGDOWN:
          if (c == 'P') {
              currentState = DoorStates.PAUSED; // paused
          } else if (c == 'O') {
              currentState = DoorStates.MOVINGUP; // movingup
              count++;
          } else {
              if (count > 0) {
                  count--;
              }
              if (count == 0) {
                  currentState = DoorStates.CLOSED;
              }
          }
          break;

      case PAUSED:
          if (c == 'P') {
              currentState = lastMovingState;
              count = (currentState == DoorStates.MOVINGUP ? count+1 : count-1);
          }
          // do nothing for O and .
          break;

      } // end switch


      if (currentState == DoorStates.MOVINGUP || 
          currentState == DoorStates.MOVINGDOWN) {
          lastMovingState = currentState;
      }

      result.append (count);
  } // endfor

  return result.toString();
} // end run

} // door class