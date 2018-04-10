package com.zqrc.foodsearch.entity;

/**
 * Created by JiaQi on 2018/4/10.
 * 标准
 */
public class Standard {
    private Integer id;
    private String uuid;//编号
    private float cl;//氯霉素
    private float fnl;//呋喃类代谢物
    private float hal;//磺胺类
    private float kntl;//奎诺酮类
    private float shsl;//四环素类
    private float jgwa;//金刚烷胺
    private float jlzs;//菌落总数
    private float dcjq;//大肠菌群
    private float hg;//汞
    private float pb;//铅
    private float gyhz;//过氧化值
    private float hfxyjd;//挥发性盐氨氮
    private String xt;//形态
    private String sz;//色泽
    private String zqw;//滋气味
    private String zz;//杂质
    private String jhl;//净含量
    private Integer type;//1 为标准   2为  检索信息

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public float getCl() {
        return cl;
    }

    public void setCl(float cl) {
        this.cl = cl;
    }

    public float getFnl() {
        return fnl;
    }

    public void setFnl(float fnl) {
        this.fnl = fnl;
    }

    public float getHal() {
        return hal;
    }

    public void setHal(float hal) {
        this.hal = hal;
    }

    public float getKntl() {
        return kntl;
    }

    public void setKntl(float kntl) {
        this.kntl = kntl;
    }

    public float getShsl() {
        return shsl;
    }

    public void setShsl(float shsl) {
        this.shsl = shsl;
    }

    public float getJgwa() {
        return jgwa;
    }

    public void setJgwa(float jgwa) {
        this.jgwa = jgwa;
    }

    public float getJlzs() {
        return jlzs;
    }

    public void setJlzs(float jlzs) {
        this.jlzs = jlzs;
    }

    public float getDcjq() {
        return dcjq;
    }

    public void setDcjq(float dcjq) {
        this.dcjq = dcjq;
    }

    public float getHg() {
        return hg;
    }

    public void setHg(float hg) {
        this.hg = hg;
    }

    public float getPb() {
        return pb;
    }

    public void setPb(float pb) {
        this.pb = pb;
    }

    public float getGyhz() {
        return gyhz;
    }

    public void setGyhz(float gyhz) {
        this.gyhz = gyhz;
    }

    public float getHfxyjd() {
        return hfxyjd;
    }

    public void setHfxyjd(float hfxyjd) {
        this.hfxyjd = hfxyjd;
    }

    public String getXt() {
        return xt;
    }

    public void setXt(String xt) {
        this.xt = xt;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    public String getZqw() {
        return zqw;
    }

    public void setZqw(String zqw) {
        this.zqw = zqw;
    }

    public String getZz() {
        return zz;
    }

    public void setZz(String zz) {
        this.zz = zz;
    }

    public String getJhl() {
        return jhl;
    }

    public void setJhl(String jhl) {
        this.jhl = jhl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
