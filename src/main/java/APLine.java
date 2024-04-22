public class APLine
{
  /* your code here */
  private int a, b, c;
  public APLine(int x, int y, int z){
    a = x;
    b = y;
    c = z;
  }
  public double getSlope(){
  return -a/b;
  }

  public boolean isOnLine(int x, int y){
  int line = (a*x) + (b*y) + c;
    if(line == 0)
      return true;
    return false;
  }
}
