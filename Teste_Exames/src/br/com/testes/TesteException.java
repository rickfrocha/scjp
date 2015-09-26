package br.com.testes;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

class MinhaClasse {
	String a = "ricardo";

	public String toString() {
		return a;
	}
}

public class TesteException extends A {

	
	public static byte[] gerarCodigoSessao() {
		DecimalFormat timeFormat4 = new DecimalFormat("0000;0000");
		Calendar cal = Calendar.getInstance();
		String val = String.valueOf(cal.get(Calendar.YEAR));
		val += timeFormat4.format(cal.get(Calendar.DAY_OF_YEAR));
		val += UUID.randomUUID().toString().replaceAll("-", "");
		return val.getBytes();
	}

	int fi = 15;

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		adicionarInfTempoLog(sb, System.currentTimeMillis());
		System.out.println(sb.toString());

		String numeroCartao = "5000.0000.0000.000000";

		System.out.println(getNumeroCartaoComMascara(numeroCartao));

		for (int i = 0; i < 100; i++) {
			System.out.println( new String(  gerarCodigoSessao()  )  );
		}

	}

	private static void adicionarInfTempoLog(final StringBuilder sb,
			final long hora) {
		final String fmtDtHoraLog = "%n %1$s %2$te/%2$tm/%2$ty %2$tk:%2$tM:%2$tS";

		sb.append(String.format(fmtDtHoraLog, "Inicio execucao:", hora));
		sb.append(String.format(fmtDtHoraLog, "Fim execucao:", hora));
		sb.append(String.format("%n Tempo: [%d] seg.", hora));
	}

	static void setColor(byte i) {
		System.out.println("" + i);

	}

	private native void nativeMethod(int i);

	// private native void nativeMethod(int i);

	public static String getNumeroCartaoComMascara(String numeroCartao) {
		StringBuilder sb = new StringBuilder();
		if (numeroCartao != null && !"".equals(numeroCartao)) {
			// numero cartao 5000.****.****.0000
			numeroCartao = numeroCartao.replace(".", "").trim();
			String prefix = numeroCartao.substring(0, 4);
			String sufix = "";
			if (numeroCartao.length() > 12) { // tamanho normal cartao= 16
				sufix = numeroCartao.substring(12);
			}
			sb.append(prefix).append(".").append("****").append(".")
					.append("****").append(".").append(sufix);
		}
		return sb.toString();
	}

}

class A {
	final int fi = 10;
}

class B extends A {

	public static void main(String[] args) {

	}
}
