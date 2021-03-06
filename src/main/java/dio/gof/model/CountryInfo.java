package dio.gof.model;

public class CountryInfo {

	private String country;
	private Integer cases;
	private Integer todayCases;
	private Integer deaths;
	private Integer todayDeaths;
	private Integer recovered;
	private Integer active;
	private Integer critical;
	private Integer casesPerOneMillion;
	private Integer deathsPerOneMillion;
	private Integer totalTests;
	private Integer testsPerOneMillion;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getCases() {
		return cases;
	}

	public void setCases(Integer cases) {
		this.cases = cases;
	}

	public Integer getTodayCases() {
		return todayCases;
	}

	public void setTodayCases(Integer todayCases) {
		this.todayCases = todayCases;
	}

	public Integer getDeaths() {
		return deaths;
	}

	public void setDeaths(Integer deaths) {
		this.deaths = deaths;
	}

	public Integer getTodayDeaths() {
		return todayDeaths;
	}

	public void setTodayDeaths(Integer todayDeaths) {
		this.todayDeaths = todayDeaths;
	}

	public Integer getRecovered() {
		return recovered;
	}

	public void setRecovered(Integer recovered) {
		this.recovered = recovered;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Integer getCritical() {
		return critical;
	}

	public void setCritical(Integer critical) {
		this.critical = critical;
	}

	public Integer getCasesPerOneMillion() {
		return casesPerOneMillion;
	}

	public void setCasesPerOneMillion(Integer casesPerOneMillion) {
		this.casesPerOneMillion = casesPerOneMillion;
	}

	public Integer getDeathsPerOneMillion() {
		return deathsPerOneMillion;
	}

	public void setDeathsPerOneMillion(Integer deathsPerOneMillion) {
		this.deathsPerOneMillion = deathsPerOneMillion;
	}

	public Integer getTotalTests() {
		return totalTests;
	}

	public void setTotalTests(Integer totalTests) {
		this.totalTests = totalTests;
	}

	public Integer getTestsPerOneMillion() {
		return testsPerOneMillion;
	}

	public void setTestsPerOneMillion(Integer testsPerOneMillion) {
		this.testsPerOneMillion = testsPerOneMillion;
	}

}