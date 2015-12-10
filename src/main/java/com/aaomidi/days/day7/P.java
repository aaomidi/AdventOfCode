package com.aaomidi.days.day7;

import com.aaomidi.days.day7.model.Signal;
import com.aaomidi.model.Problem;
import com.aaomidi.util.IntegerConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.function.IntBinaryOperator;

/**
 * Created by amir on 2015-12-07.
 */
public class P extends Problem {
    public static final HashMap<String, Wire> wires;
    private static final String input = "lf AND lq -> ls\n" +
            "iu RSHIFT 1 -> jn\n" +
            "bo OR bu -> bv\n" +
            "gj RSHIFT 1 -> hc\n" +
            "et RSHIFT 2 -> eu\n" +
            "bv AND bx -> by\n" +
            "is OR it -> iu\n" +
            "b OR n -> o\n" +
            "gf OR ge -> gg\n" +
            "NOT kt -> ku\n" +
            "ea AND eb -> ed\n" +
            "kl OR kr -> ks\n" +
            "hi AND hk -> hl\n" +
            "au AND av -> ax\n" +
            "lf RSHIFT 2 -> lg\n" +
            "dd RSHIFT 3 -> df\n" +
            "eu AND fa -> fc\n" +
            "df AND dg -> di\n" +
            "ip LSHIFT 15 -> it\n" +
            "NOT el -> em\n" +
            "et OR fe -> ff\n" +
            "fj LSHIFT 15 -> fn\n" +
            "t OR s -> u\n" +
            "ly OR lz -> ma\n" +
            "ko AND kq -> kr\n" +
            "NOT fx -> fy\n" +
            "et RSHIFT 1 -> fm\n" +
            "eu OR fa -> fb\n" +
            "dd RSHIFT 2 -> de\n" +
            "NOT go -> gp\n" +
            "kb AND kd -> ke\n" +
            "hg OR hh -> hi\n" +
            "jm LSHIFT 1 -> kg\n" +
            "NOT cn -> co\n" +
            "jp RSHIFT 2 -> jq\n" +
            "jp RSHIFT 5 -> js\n" +
            "1 AND io -> ip\n" +
            "eo LSHIFT 15 -> es\n" +
            "1 AND jj -> jk\n" +
            "g AND i -> j\n" +
            "ci RSHIFT 3 -> ck\n" +
            "gn AND gp -> gq\n" +
            "fs AND fu -> fv\n" +
            "lj AND ll -> lm\n" +
            "jk LSHIFT 15 -> jo\n" +
            "iu RSHIFT 3 -> iw\n" +
            "NOT ii -> ij\n" +
            "1 AND cc -> cd\n" +
            "bn RSHIFT 3 -> bp\n" +
            "NOT gw -> gx\n" +
            "NOT ft -> fu\n" +
            "jn OR jo -> jp\n" +
            "iv OR jb -> jc\n" +
            "hv OR hu -> hw\n" +
            "19138 -> b\n" +
            "gj RSHIFT 5 -> gm\n" +
            "hq AND hs -> ht\n" +
            "dy RSHIFT 1 -> er\n" +
            "ao OR an -> ap\n" +
            "ld OR le -> lf\n" +
            "bk LSHIFT 1 -> ce\n" +
            "bz AND cb -> cc\n" +
            "bi LSHIFT 15 -> bm\n" +
            "il AND in -> io\n" +
            "af AND ah -> ai\n" +
            "as RSHIFT 1 -> bl\n" +
            "lf RSHIFT 3 -> lh\n" +
            "er OR es -> et\n" +
            "NOT ax -> ay\n" +
            "ci RSHIFT 1 -> db\n" +
            "et AND fe -> fg\n" +
            "lg OR lm -> ln\n" +
            "k AND m -> n\n" +
            "hz RSHIFT 2 -> ia\n" +
            "kh LSHIFT 1 -> lb\n" +
            "NOT ey -> ez\n" +
            "NOT di -> dj\n" +
            "dz OR ef -> eg\n" +
            "lx -> a\n" +
            "NOT iz -> ja\n" +
            "gz LSHIFT 15 -> hd\n" +
            "ce OR cd -> cf\n" +
            "fq AND fr -> ft\n" +
            "at AND az -> bb\n" +
            "ha OR gz -> hb\n" +
            "fp AND fv -> fx\n" +
            "NOT gb -> gc\n" +
            "ia AND ig -> ii\n" +
            "gl OR gm -> gn\n" +
            "0 -> c\n" +
            "NOT ca -> cb\n" +
            "bn RSHIFT 1 -> cg\n" +
            "c LSHIFT 1 -> t\n" +
            "iw OR ix -> iy\n" +
            "kg OR kf -> kh\n" +
            "dy OR ej -> ek\n" +
            "km AND kn -> kp\n" +
            "NOT fc -> fd\n" +
            "hz RSHIFT 3 -> ib\n" +
            "NOT dq -> dr\n" +
            "NOT fg -> fh\n" +
            "dy RSHIFT 2 -> dz\n" +
            "kk RSHIFT 2 -> kl\n" +
            "1 AND fi -> fj\n" +
            "NOT hr -> hs\n" +
            "jp RSHIFT 1 -> ki\n" +
            "bl OR bm -> bn\n" +
            "1 AND gy -> gz\n" +
            "gr AND gt -> gu\n" +
            "db OR dc -> dd\n" +
            "de OR dk -> dl\n" +
            "as RSHIFT 5 -> av\n" +
            "lf RSHIFT 5 -> li\n" +
            "hm AND ho -> hp\n" +
            "cg OR ch -> ci\n" +
            "gj AND gu -> gw\n" +
            "ge LSHIFT 15 -> gi\n" +
            "e OR f -> g\n" +
            "fp OR fv -> fw\n" +
            "fb AND fd -> fe\n" +
            "cd LSHIFT 15 -> ch\n" +
            "b RSHIFT 1 -> v\n" +
            "at OR az -> ba\n" +
            "bn RSHIFT 2 -> bo\n" +
            "lh AND li -> lk\n" +
            "dl AND dn -> do\n" +
            "eg AND ei -> ej\n" +
            "ex AND ez -> fa\n" +
            "NOT kp -> kq\n" +
            "NOT lk -> ll\n" +
            "x AND ai -> ak\n" +
            "jp OR ka -> kb\n" +
            "NOT jd -> je\n" +
            "iy AND ja -> jb\n" +
            "jp RSHIFT 3 -> jr\n" +
            "fo OR fz -> ga\n" +
            "df OR dg -> dh\n" +
            "gj RSHIFT 2 -> gk\n" +
            "gj OR gu -> gv\n" +
            "NOT jh -> ji\n" +
            "ap LSHIFT 1 -> bj\n" +
            "NOT ls -> lt\n" +
            "ir LSHIFT 1 -> jl\n" +
            "bn AND by -> ca\n" +
            "lv LSHIFT 15 -> lz\n" +
            "ba AND bc -> bd\n" +
            "cy LSHIFT 15 -> dc\n" +
            "ln AND lp -> lq\n" +
            "x RSHIFT 1 -> aq\n" +
            "gk OR gq -> gr\n" +
            "NOT kx -> ky\n" +
            "jg AND ji -> jj\n" +
            "bn OR by -> bz\n" +
            "fl LSHIFT 1 -> gf\n" +
            "bp OR bq -> br\n" +
            "he OR hp -> hq\n" +
            "et RSHIFT 5 -> ew\n" +
            "iu RSHIFT 2 -> iv\n" +
            "gl AND gm -> go\n" +
            "x OR ai -> aj\n" +
            "hc OR hd -> he\n" +
            "lg AND lm -> lo\n" +
            "lh OR li -> lj\n" +
            "da LSHIFT 1 -> du\n" +
            "fo RSHIFT 2 -> fp\n" +
            "gk AND gq -> gs\n" +
            "bj OR bi -> bk\n" +
            "lf OR lq -> lr\n" +
            "cj AND cp -> cr\n" +
            "hu LSHIFT 15 -> hy\n" +
            "1 AND bh -> bi\n" +
            "fo RSHIFT 3 -> fq\n" +
            "NOT lo -> lp\n" +
            "hw LSHIFT 1 -> iq\n" +
            "dd RSHIFT 1 -> dw\n" +
            "dt LSHIFT 15 -> dx\n" +
            "dy AND ej -> el\n" +
            "an LSHIFT 15 -> ar\n" +
            "aq OR ar -> as\n" +
            "1 AND r -> s\n" +
            "fw AND fy -> fz\n" +
            "NOT im -> in\n" +
            "et RSHIFT 3 -> ev\n" +
            "1 AND ds -> dt\n" +
            "ec AND ee -> ef\n" +
            "NOT ak -> al\n" +
            "jl OR jk -> jm\n" +
            "1 AND en -> eo\n" +
            "lb OR la -> lc\n" +
            "iu AND jf -> jh\n" +
            "iu RSHIFT 5 -> ix\n" +
            "bo AND bu -> bw\n" +
            "cz OR cy -> da\n" +
            "iv AND jb -> jd\n" +
            "iw AND ix -> iz\n" +
            "lf RSHIFT 1 -> ly\n" +
            "iu OR jf -> jg\n" +
            "NOT dm -> dn\n" +
            "lw OR lv -> lx\n" +
            "gg LSHIFT 1 -> ha\n" +
            "lr AND lt -> lu\n" +
            "fm OR fn -> fo\n" +
            "he RSHIFT 3 -> hg\n" +
            "aj AND al -> am\n" +
            "1 AND kz -> la\n" +
            "dy RSHIFT 5 -> eb\n" +
            "jc AND je -> jf\n" +
            "cm AND co -> cp\n" +
            "gv AND gx -> gy\n" +
            "ev OR ew -> ex\n" +
            "jp AND ka -> kc\n" +
            "fk OR fj -> fl\n" +
            "dy RSHIFT 3 -> ea\n" +
            "NOT bs -> bt\n" +
            "NOT ag -> ah\n" +
            "dz AND ef -> eh\n" +
            "cf LSHIFT 1 -> cz\n" +
            "NOT cv -> cw\n" +
            "1 AND cx -> cy\n" +
            "de AND dk -> dm\n" +
            "ck AND cl -> cn\n" +
            "x RSHIFT 5 -> aa\n" +
            "dv LSHIFT 1 -> ep\n" +
            "he RSHIFT 2 -> hf\n" +
            "NOT bw -> bx\n" +
            "ck OR cl -> cm\n" +
            "bp AND bq -> bs\n" +
            "as OR bd -> be\n" +
            "he AND hp -> hr\n" +
            "ev AND ew -> ey\n" +
            "1 AND lu -> lv\n" +
            "kk RSHIFT 3 -> km\n" +
            "b AND n -> p\n" +
            "NOT kc -> kd\n" +
            "lc LSHIFT 1 -> lw\n" +
            "km OR kn -> ko\n" +
            "id AND if -> ig\n" +
            "ih AND ij -> ik\n" +
            "jr AND js -> ju\n" +
            "ci RSHIFT 5 -> cl\n" +
            "hz RSHIFT 1 -> is\n" +
            "1 AND ke -> kf\n" +
            "NOT gs -> gt\n" +
            "aw AND ay -> az\n" +
            "x RSHIFT 2 -> y\n" +
            "ab AND ad -> ae\n" +
            "ff AND fh -> fi\n" +
            "ci AND ct -> cv\n" +
            "eq LSHIFT 1 -> fk\n" +
            "gj RSHIFT 3 -> gl\n" +
            "u LSHIFT 1 -> ao\n" +
            "NOT bb -> bc\n" +
            "NOT hj -> hk\n" +
            "kw AND ky -> kz\n" +
            "as AND bd -> bf\n" +
            "dw OR dx -> dy\n" +
            "br AND bt -> bu\n" +
            "kk AND kv -> kx\n" +
            "ep OR eo -> eq\n" +
            "he RSHIFT 1 -> hx\n" +
            "ki OR kj -> kk\n" +
            "NOT ju -> jv\n" +
            "ek AND em -> en\n" +
            "kk RSHIFT 5 -> kn\n" +
            "NOT eh -> ei\n" +
            "hx OR hy -> hz\n" +
            "ea OR eb -> ec\n" +
            "s LSHIFT 15 -> w\n" +
            "fo RSHIFT 1 -> gh\n" +
            "kk OR kv -> kw\n" +
            "bn RSHIFT 5 -> bq\n" +
            "NOT ed -> ee\n" +
            "1 AND ht -> hu\n" +
            "cu AND cw -> cx\n" +
            "b RSHIFT 5 -> f\n" +
            "kl AND kr -> kt\n" +
            "iq OR ip -> ir\n" +
            "ci RSHIFT 2 -> cj\n" +
            "cj OR cp -> cq\n" +
            "o AND q -> r\n" +
            "dd RSHIFT 5 -> dg\n" +
            "b RSHIFT 2 -> d\n" +
            "ks AND ku -> kv\n" +
            "b RSHIFT 3 -> e\n" +
            "d OR j -> k\n" +
            "NOT p -> q\n" +
            "NOT cr -> cs\n" +
            "du OR dt -> dv\n" +
            "kf LSHIFT 15 -> kj\n" +
            "NOT ac -> ad\n" +
            "fo RSHIFT 5 -> fr\n" +
            "hz OR ik -> il\n" +
            "jx AND jz -> ka\n" +
            "gh OR gi -> gj\n" +
            "kk RSHIFT 1 -> ld\n" +
            "hz RSHIFT 5 -> ic\n" +
            "as RSHIFT 2 -> at\n" +
            "NOT jy -> jz\n" +
            "1 AND am -> an\n" +
            "ci OR ct -> cu\n" +
            "hg AND hh -> hj\n" +
            "jq OR jw -> jx\n" +
            "v OR w -> x\n" +
            "la LSHIFT 15 -> le\n" +
            "dh AND dj -> dk\n" +
            "dp AND dr -> ds\n" +
            "jq AND jw -> jy\n" +
            "au OR av -> aw\n" +
            "NOT bf -> bg\n" +
            "z OR aa -> ab\n" +
            "ga AND gc -> gd\n" +
            "hz AND ik -> im\n" +
            "jt AND jv -> jw\n" +
            "z AND aa -> ac\n" +
            "jr OR js -> jt\n" +
            "hb LSHIFT 1 -> hv\n" +
            "hf OR hl -> hm\n" +
            "ib OR ic -> id\n" +
            "fq OR fr -> fs\n" +
            "cq AND cs -> ct\n" +
            "ia OR ig -> ih\n" +
            "dd OR do -> dp\n" +
            "d AND j -> l\n" +
            "ib AND ic -> ie\n" +
            "as RSHIFT 3 -> au\n" +
            "be AND bg -> bh\n" +
            "dd AND do -> dq\n" +
            "NOT l -> m\n" +
            "1 AND gd -> ge\n" +
            "y AND ae -> ag\n" +
            "fo AND fz -> gb\n" +
            "NOT ie -> if\n" +
            "e AND f -> h\n" +
            "x RSHIFT 3 -> z\n" +
            "y OR ae -> af\n" +
            "hf AND hl -> hn\n" +
            "NOT h -> i\n" +
            "NOT hn -> ho\n" +
            "he RSHIFT 5 -> hh";

    static {
        wires = new HashMap<>();
    }

    public P() {
        super("Day 7: Some Assembly Required");
    }

    static Signal getElement(String s) {
        Integer i = IntegerConverter.fromString(s);

        if (i == null) {
            return new LazyWire(s);
        }

        return new LiteralWire(i);
    }

    @Override
    public String solvePart1() {
        for (String s : input.split("\n")) {
            String[] split = s.split(" ");
            Wire wire = new Wire();
            if (split.length == 3) {
                wire.setSignal(getElement(split[0]));

                wires.put(split[2], wire);
            } else if (split[0].equals("NOT")) {
                wire.setSignal(new NegativeWire(getElement(split[1])));
                wires.put(split[3], wire);
            } else {
                wire.setSignal(new Operator(getElement(split[0]), getElement(split[2]), split[1]));
                wires.put(split[4], wire);
            }
        }

        return wires.get("a").getValue() + "";
    }

    @Override
    public String solvePart2() {
        int b = wires.get("a").getValue();
        clearCache();
        wires.get("b").setSignal(new LiteralWire(b));

        return wires.get("a").getValue() + "";
    }

    public void clearCache() {
        wires.values().forEach(P.Wire::clearCache);
    }

    @AllArgsConstructor
    static class LazyWire implements Signal {
        private String name;

        @Override
        public int getValue() {
            return wires.get(name).getValue();
        }
    }

    @AllArgsConstructor
    static class LiteralWire implements Signal {
        @Getter
        int value;
    }

    @AllArgsConstructor
    static class NegativeWire implements Signal {
        private Signal original;

        @Override
        public int getValue() {
            return ~original.getValue();
        }
    }

    @NoArgsConstructor
    static class Wire implements Signal {
        private String identifier;
        @Setter
        private Signal signal;
        private Integer i;

        @Override
        public int getValue() {
            if (i == null) {
                i = signal.getValue() & 0xffff;
            }

            return i;
        }

        public void clearCache() {
            i = null;
        }
    }

    static class Operator implements Signal {
        Signal op1, op2;
        private OpType opType;

        public Operator(Signal op1, Signal op2, String op) {
            this.opType = OpType.getOpType(op);
            this.op1 = op1;
            this.op2 = op2;
        }

        @Override
        public int getValue() {
            return opType.getOperator().applyAsInt(op1.getValue(), op2.getValue());
        }

        @AllArgsConstructor
        enum OpType {
            AND((a, b) -> a & b),
            OR((a, b) -> a | b),
            LSHIFT((a, b) -> a << b),
            RSHIFT((a, b) -> a >> b);
            @Getter
            IntBinaryOperator operator;

            static OpType getOpType(String s) {
                for (OpType t : OpType.values()) {
                    if (t.name().toUpperCase().equals(s.toUpperCase())) {
                        return t;
                    }
                }
                return null;
            }
        }
    }
}
