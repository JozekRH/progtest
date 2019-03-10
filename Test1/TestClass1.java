package Test1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;

import ru.progwards.lms.main.TestResult;

public class TestClass1{

	private static String testRightResult = "514263424911336592579396579289954520826834443526829600435873863248622654140207140138925514762610700100992755711440595791673560394372420894271363236890220795622156962279145089144790590766825123267598809824638290242678314854666540447372384043164600945249911273857878346679362876357499204290285069442042444471200522923293491036723024286623172850155258882103975837070714801788407729726923570547182399886189676168711943464625099170269110089476956181083454209957733682149390541651658937860506067011215222435859797671748514023462634575877112541265857011723314539904152316087295347817203811229658998710185320037352845593423725526271323006389582539601208794805085509523363363844566868744023292625362045745997388951083823542785159371236389909470974738599166720611351903568781845409425624666559791912022122897108388733347738351183912879567255044261504614219148441918105232576587709988549275792703440923434006592840076974180213220388892946370234232414834360527528928280472094493359682662519127203581813404104542972181231076224891404730611459033219426932250660389874831637094026012304670549443491110558503487799890585170699608762679570920521572784344305457768002450765067824024074242127042267490747692722422733945450760323640619100021663675080870429299040891840880753646474330069332723202183345822682199067634632613871613185005039704913147811005564943610633413714357778796118315412553837120429675202849608463310347678307117777960404258101788828257784920659671082363171157289668904381254080676855815524987553372657063695970396681091614491407072407112798594279199124438724052843058913668029547634219059701520631145818744942011883877570743585799931087019958576080768017925827346100046097527064929564528474349547038178370043823628944670926601955537657427194815893365884948631016675478967987281402249215848093553343797071563426205704968340863586923094646720333067620626504796007239299163445638199847941146318217181637965012068435082399788137090460167819041845511951296934273988759169877839532492294430334328469729051981315302242889228341251542112481598436096294690518890330853605407704802563345120170537044758617754657777775930041014416619743935590363177308881251521509638377918595294747887970034209028019490210394392422302403687059119407005858379521370989944572362900057457354208037588537232069921346429977050109405813861684274738297367281671001465263250988895885167589422311742182943472894287860556997151265291783384910157203679779458354245579846973830472593370160977523707902575129803072039857524154149354311250529579592001";
	
	@Test
	public void runTest()
	{
		Fibonacci f = new Fibonacci();
		Assert.assertTrue("Тест dynamic не прошел", f.dynamic(12001).toString().equals(testRightResult));
		Assert.assertTrue("Тест matrix не прошел", f.matrix(12001).toString().equals(testRightResult));
	}
	
	public static TestResult processResult(Result jUnitResult)
	{
		return null;
		//return new TestResult(true, 50, "Ляляля");
	}
}

