package Principal.Controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;

public class ControllerImpressao {

	public static void imprimir(String texto) {

		InputStream              prin              = new ByteArrayInputStream(texto.getBytes());
		DocFlavor                docFlavor         = DocFlavor.INPUT_STREAM.AUTOSENSE;
		SimpleDoc                documentoTexto    = new SimpleDoc(prin, docFlavor, null);
		PrintService             impressora        = PrintServiceLookup.lookupDefaultPrintService();
		PrintRequestAttributeSet printerAttributes = new HashPrintRequestAttributeSet();

		printerAttributes.add(new JobName("Impressao", null));
		printerAttributes.add(OrientationRequested.PORTRAIT);
		printerAttributes.add(MediaSizeName.ISO_A4);

		DocPrintJob printJob = impressora.createPrintJob();

		try {
			printJob.print(documentoTexto, (PrintRequestAttributeSet) printerAttributes);
		} catch (PrintException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível imprimir", "Erro", JOptionPane.ERROR_MESSAGE);
		}
                
	}
}
