package doc;

public class Lessons {
	boolean l01,l02,l03,l04,l05,l06,l07,l08,l09,l10,
			l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
	String herite,implementes,description,nameClass;
	boolean mainClass,resources;
	public String getDescription() {
		return description;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public Lessons(String nameClass,boolean l01, boolean l02, boolean l03, boolean l04, boolean l05, boolean l06, boolean l07,
			boolean l08, boolean l09, boolean l10, boolean l11, boolean l12, boolean l13, boolean l14, boolean l15,
			boolean l16, boolean l17, boolean l18, boolean l19, boolean l20, boolean l21, String herite,
			String implementes, String description, boolean mainClass, boolean resources, String[] nameResources) {
		super();
		this.nameClass=nameClass;
		this.l01 = l01;
		this.l02 = l02;
		this.l03 = l03;
		this.l04 = l04;
		this.l05 = l05;
		this.l06 = l06;
		this.l07 = l07;
		this.l08 = l08;
		this.l09 = l09;
		this.l10 = l10;
		this.l11 = l11;
		this.l12 = l12;
		this.l13 = l13;
		this.l14 = l14;
		this.l15 = l15;
		this.l16 = l16;
		this.l17 = l17;
		this.l18 = l18;
		this.l19 = l19;
		this.l20 = l20;
		this.l21 = l21;
		this.herite = herite;
		this.implementes = implementes;
		this.description = description;
		this.mainClass = mainClass;
		this.resources = resources;
		this.nameResources = nameResources;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	String[] nameResources;

	public boolean isL01() {
		return l01;
	}
	public void setL01(boolean l01) {
		this.l01 = l01;
	}
	public boolean isL02() {
		return l02;
	}
	public void setL02(boolean l02) {
		this.l02 = l02;
	}
	public boolean isL03() {
		return l03;
	}
	public void setL03(boolean l03) {
		this.l03 = l03;
	}
	public boolean isL04() {
		return l04;
	}
	public void setL04(boolean l04) {
		this.l04 = l04;
	}
	public boolean isL05() {
		return l05;
	}
	public void setL05(boolean l05) {
		this.l05 = l05;
	}
	public boolean isL06() {
		return l06;
	}
	public void setL06(boolean l06) {
		this.l06 = l06;
	}
	public boolean isL07() {
		return l07;
	}
	public void setL07(boolean l07) {
		this.l07 = l07;
	}
	public boolean isL08() {
		return l08;
	}
	public void setL08(boolean l08) {
		this.l08 = l08;
	}
	public boolean isL09() {
		return l09;
	}
	public void setL09(boolean l09) {
		this.l09 = l09;
	}
	public boolean isL10() {
		return l10;
	}
	public void setL10(boolean l10) {
		this.l10 = l10;
	}
	public boolean isL11() {
		return l11;
	}
	public void setL11(boolean l11) {
		this.l11 = l11;
	}
	public boolean isL12() {
		return l12;
	}
	public void setL12(boolean l12) {
		this.l12 = l12;
	}
	public boolean isL13() {
		return l13;
	}
	public void setL13(boolean l13) {
		this.l13 = l13;
	}
	public boolean isL14() {
		return l14;
	}
	public void setL14(boolean l14) {
		this.l14 = l14;
	}
	public boolean isL15() {
		return l15;
	}
	public void setL15(boolean l15) {
		this.l15 = l15;
	}
	public boolean isL16() {
		return l16;
	}
	public void setL16(boolean l16) {
		this.l16 = l16;
	}
	public boolean isL17() {
		return l17;
	}
	public void setL17(boolean l17) {
		this.l17 = l17;
	}
	public boolean isL18() {
		return l18;
	}
	public void setL18(boolean l18) {
		this.l18 = l18;
	}
	public boolean isL19() {
		return l19;
	}
	public void setL19(boolean l19) {
		this.l19 = l19;
	}
	public boolean isL20() {
		return l20;
	}
	public void setL20(boolean l20) {
		this.l20 = l20;
	}
	public boolean isL21() {
		return l21;
	}
	public void setL21(boolean l21) {
		this.l21 = l21;
	}
	public String getHerite() {
		return herite;
	}
	public void setHerite(String herite) {
		this.herite = herite;
	}
	public String getImplementes() {
		return implementes;
	}
	public void setImplementes(String implementes) {
		this.implementes = implementes;
	}
	public boolean isMainClass() {
		return mainClass;
	}
	public void setMainClass(boolean mainClass) {
		this.mainClass = mainClass;
	}
	public boolean isResources() {
		return resources;
	}
	public void setResources(boolean resources) {
		this.resources = resources;
	}
	public String[] getNameResources() {
		return nameResources;
	}
	public void setNameResources(String[] nameResources) {
		this.nameResources = nameResources;
	}
}
