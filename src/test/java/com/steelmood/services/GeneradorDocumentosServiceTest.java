package com.steelmood.services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

import com.steelmood.services.impl.GeneradorDocumentosService;

import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.template.TemplateEngineKind;

public class GeneradorDocumentosServiceTest {
	
	private static final String FECHA = "14/09/2015";
	private static final String NOMBRE = "Periquito el de los palotes";
	private static final String TEXTO = "Lorem ipsum ad his scripta blandit partiendo, eum fastidii accumsan euripidis in, eum liber hendrerit an. Qui ut wisi vocibus suscipiantur, quo dicit ridens inciderint id. Quo mundi lobortis reformidans eu, legimus senserit definiebas an eos. Eu sit tincidunt incorrupte definitionem, vis mutat affert percipit cu, eirmod consectetuer signiferumque eu per. In usu latine equidem dolores. Quo no falli viris intellegam, ut fugit veritus placerat per.\n" +
			"\n" +
			"Ius id vidit volumus mandamus, vide veritus democritum te nec, ei eos debet libris consulatu. No mei ferri graeco dicunt, ad cum veri accommodare. Sed at malis omnesque delicata, usu et iusto zzril meliore. Dicunt maiorum eloquentiam cum cu, sit summo dolor essent te. Ne quodsi nusquam legendos has, ea dicit voluptua eloquentiam pro, ad sit quas qualisque. Eos vocibus deserunt quaestio ei.\n" +
			"\n" +
			"Blandit incorrupte quaerendum in quo, nibh impedit id vis, vel no nullam semper audiam. Ei populo graeci consulatu mei, has ea stet modus phaedrum. Inani oblique ne has, duo et veritus detraxit. Tota ludus oratio ea mel, offendit persequeris ei vim. Eos dicat oratio partem ut, id cum ignota senserit intellegat. Sit inani ubique graecis ad, quando graecis liberavisse et cum, dicit option eruditi at duo. Homero salutatus suscipiantur eum id, tamquam voluptaria expetendis ad sed, nobis feugiat similique usu ex.\n" +
			"\n" +
			"Eum hinc argumentum te, no sit percipit adversarium, ne qui feugiat persecuti. Odio omnes scripserit ad est, ut vidit lorem maiestatis his, putent mandamus gloriatur ne pro. Oratio iriure rationibus ne his, ad est corrumpit splendide. Ad duo appareat moderatius, ei falli tollit denique eos. Dicant evertitur mei in, ne his deserunt perpetua sententiae, ea sea omnes similique vituperatoribus. Ex mel errem intellegebat comprehensam, vel ad tantas antiopam delicatissimi, tota ferri affert eu nec. Legere expetenda pertinacia ne pro, et pro impetus persius assueverit.\n" +
			"\n" +
			"Ea mei nullam facete, omnis oratio offendit ius cu. Doming takimata repudiandae usu an, mei dicant takimata id, pri eleifend inimicus euripidis at. His vero singulis ea, quem euripidis abhorreant mei ut, et populo iriure vix. Usu ludus affert voluptaria ei, vix ea error definitiones, movet fastidii signiferumque in qui.\n" +
			"\n" +
			"Vis prodesset adolescens adipiscing te, usu mazim perfecto recteque at, assum putant erroribus mea in. Vel facete imperdiet id, cum an libris luptatum perfecto, vel fabellas inciderint ut. Veri facete debitis ea vis, ut eos oratio erroribus. Sint facete perfecto no vel, vim id omnium insolens. Vel dolores perfecto pertinacia ut, te mel meis ullum dicam, eos assum facilis corpora in.\n" +
			"\n" +
			"Mea te unum viderer dolores, nostrum detracto nec in, vis no partem definiebas constituam. Dicant utinam philosophia has cu, hendrerit prodesset at nam, eos an bonorum dissentiet. Has ad placerat intellegam consectetuer, no adipisci mandamus senserit pro, torquatos similique percipitur est ex. Pro ex putant deleniti repudiare, vel an aperiam sensibus suavitate. Ad vel epicurei convenire, ea soluta aliquid deserunt ius, pri in errem putant feugiat.\n" +
			"\n" +
			"Sed iusto nihil populo an, ex pro novum homero cotidieque. Te utamur civibus eleifend qui, nam ei brute doming concludaturque, modo aliquam facilisi nec no. Vidisse maiestatis constituam eu his, esse pertinacia intellegam ius cu. Eos ei odio veniam, eu sumo altera adipisci eam, mea audiam prodesset persequeris ea. Ad vitae dictas vituperata sed, eum posse labore postulant id. Te eligendi principes dignissim sit, te vel dicant officiis repudiandae.\n" +
			"\n" +
			"Id vel sensibus honestatis omittantur, vel cu nobis commune patrioque. In accusata definiebas qui, id tale malorum dolorem sed, solum clita phaedrum ne his. Eos mutat ullum forensibus ex, wisi perfecto urbanitas cu eam, no vis dicunt impetus. Assum novum in pri, vix an suavitate moderatius, id has reformidans referrentur. Elit inciderint omittantur duo ut, dicit democritum signiferumque eu est, ad suscipit delectus mandamus duo. An harum equidem maiestatis nec.\n" +
			"\n" +
			"At has veri feugait placerat, in semper offendit praesent his. Omnium impetus facilis sed at, ex viris tincidunt ius. Unum eirmod dignissim id quo. Sit te atomorum quaerendum neglegentur, his primis tamquam et. Eu quo quot veri alienum, ea eos nullam luptatum accusamus. Ea mel causae phaedrum reprimique, at vidisse dolores ocurreret nam.";

	private static final String AUTOR = "Francisco Luis Paredes";
	
	/**
	 * Test method for
	 * {@link com.steelmood.services.impl.GeneradorDocumentosService#mergeAndGenerateOutput(java.lang.String, fr.opensagres.xdocreport.template.TemplateEngineKind, java.util.Map, java.util.Map)}
	 * .
	 * 
	 * @throws XDocReportException
	 * @throws IOException
	 */
	@Test
	public void testDocx() throws IOException, XDocReportException {

		String rutaPlantilla = "Prueba.docx";
		String extension = "docx";
		
		this.generarDocumento(rutaPlantilla, extension, false);
	}
	
	/**
	 * Test method for
	 * {@link com.steelmood.services.impl.GeneradorDocumentosService#mergeAndGenerateOutput(java.lang.String, fr.opensagres.xdocreport.template.TemplateEngineKind, java.util.Map, java.util.Map)}
	 * .
	 * 
	 * @throws XDocReportException
	 * @throws IOException
	 */
	@Test
	public void testOdtPdf() throws IOException, XDocReportException {
		// La conversi�n a PDF desde Docx no se puede hacer.
		String rutaPlantilla = "Prueba.odt";
		String extension = "pdf";
		
		this.generarDocumento(rutaPlantilla, extension, true);
	}
	
	/**
	 * Test method for
	 * {@link com.steelmood.services.impl.GeneradorDocumentosService#mergeAndGenerateOutput(java.lang.String, fr.opensagres.xdocreport.template.TemplateEngineKind, java.util.Map, java.util.Map)}
	 * .
	 * 
	 * @throws XDocReportException
	 * @throws IOException
	 */
	@Test
	public void testDocxPdf() throws IOException, XDocReportException {
		// La conversi�n a PDF desde Docx no se puede hacer.
		String rutaPlantilla = "Prueba.docx";
		String extension = "pdf";
		
		this.generarDocumento(rutaPlantilla, extension, true);
	}
	
	/**
	 * Test method for
	 * {@link com.sambhashanam.docx.DocxDocumentMergerAndConverter#mergeAndGenerateOutput(java.lang.String, fr.opensagres.xdocreport.template.TemplateEngineKind, java.util.Map, java.util.Map)}
	 * .
	 * 
	 * @throws XDocReportException
	 * @throws IOException
	 */
	@Test
	public void testOdt() throws IOException, XDocReportException {

		String rutaPlantilla = "Prueba.odt";
		String extension = "odt";
		
		this.generarDocumento(rutaPlantilla, extension, false);
	}
	
	/**
	 * Genera el documento pasandole la ruta de la plantilla y la extensi�n.
	 * @param rutaPlantilla
	 * @param extension
	 * @throws IOException
	 * @throws XDocReportException
	 */
	private void generarDocumento(String rutaPlantilla, String extension, boolean convertirPdf) throws IOException, XDocReportException {
		// Mapa con las variables a reemplazar
		Map<String, Object> variablesMap = new HashMap<String, Object>();
		variablesMap.put("fecha", FECHA);
		variablesMap.put("nombre", NOMBRE);
		variablesMap.put("texto", TEXTO);
		variablesMap.put("autor", AUTOR);
		
		// Mapa con las variables de tipo imagen. Estas variables contienen el path de la imagen
		Map<String, String> imagenesMap = new HashMap<String, String>();
		imagenesMap.put("header_image_logo", "Logo_Steelmood.jpg");

		GeneradorDocumentosService generadorDocumentosService = new GeneradorDocumentosService();
		byte[] mergedOutput = generadorDocumentosService.generarDocumento(rutaPlantilla,
				TemplateEngineKind.Freemarker, variablesMap, imagenesMap, convertirPdf);
		
		// Se comprueba que se ha generado el documento
		assertNotNull(mergedOutput);
		
		// Se escribe el documento de salida
		FileOutputStream os = new FileOutputStream("Prueba_generado_" + System.nanoTime() + "." + extension);
		os.write(mergedOutput);
		os.flush();
		os.close();
	}
}
