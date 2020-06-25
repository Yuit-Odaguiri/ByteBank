package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {
	
		private double TotalImposto;
	
		public void registra(Tributavel t) {
			double valor = t.getValorImposto();
			this.setTotalImposto(this.getTotalImposto() + valor);
		}

		public double getTotalImposto() {
			return TotalImposto;
		}

		public void setTotalImposto(double totalImposto) {
			TotalImposto = totalImposto;
		}
}
