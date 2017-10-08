package JOHacks;

import JOHacks.Generic.KeyPair;
import JOHacks.Miner.Miner;
import JOHacks.Wallet.Wallet;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testCreateWallet()
    {
        Wallet wallet = new Wallet();
    }
    
    public void testCreateWalletWithKeys()
    {
        Wallet wallet = new Wallet();

    	KeyPair keypair = wallet.GenerateKeyPair();    	
    }

    public void testMinerSha1Hash() {
    	Miner miner = new Miner();
    	String hash= miner.calcHash("hello world");
    	assertEquals("2aae6c35c94fcfb415dbe95f408b9ce91ee846ed",hash);
    }
}
