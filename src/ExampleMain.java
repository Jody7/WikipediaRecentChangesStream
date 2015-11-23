public class ExampleMain {

    public static void main(String... args){

        ExampleWiki exW = new ExampleWiki();
        WikiStreamer wikiS = new WikiStreamer();

        wikiS.addWikiListener(exW);
    }

}
