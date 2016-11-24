package study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/*
 * 寮傚父锛�
 *    绋嬪簭鍦ㄨ繍琛屾湡闂村彂鐢熺殑涓嶆甯哥殑浜嬩欢锛屽彂鐢熷紓甯稿悗娴佺▼缁堟銆�
 *    寮傚父鍒嗙被锛�
 *      1 Error:JVM鍐呴儴閿欒鎴栬祫婧愯�楀敖瀵艰嚧鐨勯敊璇紝绋嬪簭鍛樻棤闇�澶勭悊銆�
 *      2 Exception:
 *        1)涓�鑸紓甯�(鎴栧彈妫�寮傚父)锛氱紪璇戝櫒瑕佹眰蹇呴』澶勭悊鐨勫紓甯搞�備笉澶勭悊鍒欑紪璇戞棤娉曢�氳繃銆傛槸澶栫晫鍥犵礌瀵艰嚧鐨勩��
 *        渚嬪锛氭枃浠舵棤娉曟壘鍒� java.io.FileNotFoundException 
 *        2)杩愯鏃跺紓甯�(鎴栭潪鍙楁寮傚父)RuntimeException锛氱紪璇戝櫒涓嶈姹傚己鍒跺鐞嗙殑寮傚父銆傛槸缂栫▼鏃剁殑閫昏緫閿欒锛岀▼搴忓憳搴旇绉瀬閬垮厤銆�
 *        渚嬪锛氱粍涓嬫爣瓒婄晫锛歫ava.lang.ArrayIndexOutOfBoundsException
 * 寮傚父澶勭悊姝ラ锛�
 *   1 鍙戠敓寮傚父鏃跺�欙紝浼氳嚜鍔ㄤ骇鐢熶竴涓紓甯稿璞°��
 *   2 浜х敓鐨勫紓甯稿璞′細浜ょ粰JVM杩涜锛岃繖涓繃绋嬬О涓簍hrow鎶涘嚭寮傚父
 *   3 JVM浼氭煡鎵捐兘澶勭悊璇ュ紓甯哥殑浠ｇ爜銆傚鏋滄壘鍒帮紝鍒欒繘琛屽搴旂殑澶勭悊锛岀О涓哄紓甯哥殑鎹曡幏銆傛病鏈夋壘鍒板鐞嗕唬鐮侊紝鍒橨VM寮傚父閫�鍑猴紝绋嬪簭缁堟銆�
 * 寮傚父澶勭悊锛�
 *  璇硶锛�
 *   try{
 *     鍙兘浼氬嚭鐜板紓甯哥殑浠ｇ爜銆�
 *   }
 *   ......
 *   catch(寮傚父绫诲瀷   寮傚父鍙橀噺澹版槑){
 *      鍑虹幇鍖归厤寮傚父鏃跺�欑殑澶勭悊浠ｇ爜銆�
 *   }
 *   [
 *    finally{
 *      鏃犺鎵ц鎴愬姛鎴栧彂鐢熷紓甯稿潎浼氭墽琛岀殑浠ｇ爜
 *    }
 *   ]
 *   娉ㄦ剰锛�
 *     1  鍑虹幇寮傚父鍚庡鐞嗕唬鐮佷腑搴旇娣诲姞寮傚父瀵硅薄鐩稿叧淇℃伅銆俥.printStackTrace();鎴栬�卐.getMessage();
 *     2  鎹曡幏寮傚父鏃跺�欙紝濡傛灉寮傚父瀛樺湪瀛愮埗绫诲叧绯伙紝鍒欓渶瑕佹妸瀛愮被寮傚父瀹氫箟鍦ㄥ墠闈紝鍚﹀垯浼氳鐖剁被鎹曡幏锛屽鑷村瓙绫诲紓甯稿鐞嗕笉浼氳鎵ц銆�
 *     3  JDK1.7浠ュ悗锛屽鏋滃紓甯稿鐞嗕唬鐮侀�昏緫鐩稿悓锛屽彲浠ユ妸涓嶅悓鐖剁被鐨勫瓙绫婚泦涓湪涓�涓猚atch澶勭悊涓�侲xception1 e1|Exception2 e2
 *     4  finally浠ｇ爜鍧椾腑浠ｇ爜鏃犺濡備綍鍧囦細鎵ц
 * throws 鎶涘嚭寮傚父绫诲瀷锛�
 *    瀵瑰紓甯镐笉鐭ラ亾濡備綍澶勭悊锛屽垯鎶涘嚭寮傚父銆�
 *    鐗圭偣锛�
 *      1 璋佽皟鐢ㄨ鏂规硶锛岃皝澶勭悊銆�
 *      2 main鏂规硶涓繀椤诲鍙楁寮傚父杩涜澶勭悊锛屼笉鑳絫hrows銆傚闈炲彈妫�寮傚父涓嶅仛寮哄埗瑕佹眰锛屼絾鏄竴鏃﹀紓甯稿嚭鐜帮紝绋嬪簭缁堟銆�
 *      3 瀵归潪鍙楁寮傚父浣跨敤throws涓嶈捣浣滅敤銆�
 *    璇硶锛�
 *      鏂规硶鍚�  throws 寮傚父绫诲瀷[,寮傚父绫诲瀷2......]{
 *        
 *      }
 * throw:鎶涘嚭寮傚父瀵硅薄
 *   娉ㄦ剰锛�
 *      1 瀵逛簬杩愯鏃跺紓甯�(鎴栭潪鍙楁寮傚父)锛岀洿鎺hrow寮傚父瀵硅薄灏辫浜�
 *      2 瀵逛簬涓�鑸紓甯�(鎴栧彈妫�寮傚父),throw寮傚父瀵硅薄鍚庯紝鏂规硶蹇呴』鍚屾椂throws寮傚父绫诲瀷
 * throws鍜宼hrow鐨勫尯鍒細
 *   1 澹版槑鐨勫湴鏂逛笉鍚岋細throws鐢ㄤ簬鏂规硶澹版槑鍚庨潰锛宼hrow鍒欏湪鏂规硶浣撲腑
 *   2 澹版槑鐨勭被鍨嬩笉鍚岋細throws鎶涘嚭寮傚父绫诲瀷,throw鍒欐姏鍑哄紓甯稿璞°��    
 */
public class TestException1 {

	public static void main(String[] args) {
		System.out.println("寮�濮嬶紒锛侊紒锛�");	
//		divide(3,0);
//		try {
//			read();
//			
//		} catch (FileNotFoundException e1) {
//			System.out.println("鏂囦欢涓㈠け" + e1.getMessage());
//		}
//		catch(IOException e2){
//			System.out.println("鏂囦欢澶勭悊鏈夎锛�"+e2.getMessage());
//		}
//		catch(Exception e){
//		  	System.out.println("鍏朵粬寮傚父"+e.getMessage());
//		}
		try {
			write();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("鎵ц瀹屾瘯");
	}

	public static void divide(int x, int y) throws ArithmeticException{
		
		System.out.println(x / y);
	}
    //鍙楁寮傚父锛屼娇鐢╰hrows鎶涘嚭锛岃鏂规硶鐨勮皟鐢ㄨ�呭繀椤诲鐞嗚寮傚父銆傚叾涓殑寮傚父瀵硅薄鏄郴缁熻嚜鍔ㄦ姏鍑虹殑銆�
	public static void read() throws FileNotFoundException, IOException {
		File file = new File("d:/瀛︿範.txt");
		InputStream isr = null;

		isr = new FileInputStream(file);
		System.out.println("璇诲彇鏂囦欢锛侊紒锛�");
		isr.read();

	}
	//寮傚父瀵硅薄鐢辩紪绋嬩汉鍛樻姏鍑�
	public static void write() throws FileNotFoundException{
		File file = new File("d:/hello444.txt");
		try{
			InputStream isr =  new FileInputStream(file);
		}catch(Exception e){
			throw new  FileNotFoundException("杩欐槸鎴戝啓鐨勶細鍑洪敊浜�");
		}
	}
}
