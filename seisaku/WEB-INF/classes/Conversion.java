//���s�ɑΉ�����
//�^�O�����O����

public class Conversion{
  //������replace���\�b�h�ŕϊ�����
  public static String conversionText(String text){
    String conversion=text.replace("<","&lt;").replace(">","&gt;").replace("\r\n","<br>").replace("\'","&#39;").replace("\"","&quot;").replace(",","&#44;");

    return conversion;
  }
}
