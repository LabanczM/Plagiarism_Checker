package plagiarism_checker;

/**
 *
 * @author Labancz Marton
 */
public class Plagiarism_Checker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      		try {
			String mainFile = "../CYMJUP_HIA_Beadando/sample_txt/sample1.txt";
			String patternFile = "../CYMJUP_HIA_Beadando/sample_txt/sample2.txt";
			System.out.println("Algoritmusok lefutottak, az eredmeny a txt-jukben.");
			KMPAlgorithm kmp = new KMPAlgorithm(mainFile, patternFile);
			BoyerMooreAlgorithm boyermoore = new BoyerMooreAlgorithm(mainFile, patternFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    }
