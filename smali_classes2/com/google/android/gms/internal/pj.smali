.class public final Lcom/google/android/gms/internal/pj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ok;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/pj$a;,
        Lcom/google/android/gms/internal/pj$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/os;

.field private final b:Lcom/google/android/gms/internal/nq;

.field private final c:Lcom/google/android/gms/internal/ot;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/os;Lcom/google/android/gms/internal/nq;Lcom/google/android/gms/internal/ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/pj;->a:Lcom/google/android/gms/internal/os;

    iput-object p2, p0, Lcom/google/android/gms/internal/pj;->b:Lcom/google/android/gms/internal/nq;

    iput-object p3, p0, Lcom/google/android/gms/internal/pj;->c:Lcom/google/android/gms/internal/ot;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Field;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/nr;",
            "Ljava/lang/reflect/Field;",
            "Lcom/google/android/gms/internal/po",
            "<*>;)",
            "Lcom/google/android/gms/internal/oj",
            "<*>;"
        }
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/ol;

    invoke-virtual {p2, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ol;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/pj;->a:Lcom/google/android/gms/internal/os;

    invoke-static {v1, p1, p3, v0}, Lcom/google/android/gms/internal/pe;->a(Lcom/google/android/gms/internal/os;Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/ol;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/pj;Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Field;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/pj;->a(Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Field;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Field;Ljava/lang/String;Lcom/google/android/gms/internal/po;ZZ)Lcom/google/android/gms/internal/pj$b;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/nr;",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/po",
            "<*>;ZZ)",
            "Lcom/google/android/gms/internal/pj$b;"
        }
    .end annotation

    invoke-virtual {p4}, Lcom/google/android/gms/internal/po;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/oy;->a(Ljava/lang/reflect/Type;)Z

    move-result v8

    new-instance v0, Lcom/google/android/gms/internal/pj$1;

    move-object v1, p0

    move-object v2, p3

    move v3, p5

    move v4, p6

    move-object v5, p1

    move-object v6, p2

    move-object v7, p4

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/pj$1;-><init>(Lcom/google/android/gms/internal/pj;Ljava/lang/String;ZZLcom/google/android/gms/internal/nr;Ljava/lang/reflect/Field;Lcom/google/android/gms/internal/po;Z)V

    return-object v0
.end method

.method static a(Lcom/google/android/gms/internal/nq;Ljava/lang/reflect/Field;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/nq;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/om;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/om;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    if-nez v0, :cond_1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/nq;->a(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/om;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Lcom/google/android/gms/internal/om;->b()[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private a(Ljava/lang/reflect/Field;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Field;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/pj;->b:Lcom/google/android/gms/internal/nq;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/pj;->a(Lcom/google/android/gms/internal/nq;Ljava/lang/reflect/Field;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;Ljava/lang/Class;)Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/nr;",
            "Lcom/google/android/gms/internal/po",
            "<*>;",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/pj$b;",
            ">;"
        }
    .end annotation

    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v10

    :goto_0
    return-object v1

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v12

    :goto_1
    const-class v1, Ljava/lang/Object;

    move-object/from16 v0, p3

    if-eq v0, v1, :cond_6

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v13

    array-length v14, v13

    const/4 v1, 0x0

    move v11, v1

    :goto_2
    if-ge v11, v14, :cond_5

    aget-object v3, v13, v11

    const/4 v1, 0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/internal/pj;->a(Ljava/lang/reflect/Field;Z)Z

    move-result v6

    const/4 v1, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/internal/pj;->a(Ljava/lang/reflect/Field;Z)Z

    move-result v7

    if-nez v6, :cond_2

    if-nez v7, :cond_2

    :cond_1
    add-int/lit8 v1, v11, 0x1

    move v11, v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v2

    move-object/from16 v0, p3

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/or;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v15

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/pj;->a(Ljava/lang/reflect/Field;)Ljava/util/List;

    move-result-object v16

    const/4 v8, 0x0

    const/4 v1, 0x0

    move v9, v1

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v1

    if-ge v9, v1, :cond_4

    move-object/from16 v0, v16

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v9, :cond_3

    const/4 v6, 0x0

    :cond_3
    invoke-static {v15}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object v5

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/pj;->a(Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Field;Ljava/lang/String;Lcom/google/android/gms/internal/po;ZZ)Lcom/google/android/gms/internal/pj$b;

    move-result-object v1

    invoke-interface {v10, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/pj$b;

    if-nez v8, :cond_7

    :goto_4
    add-int/lit8 v2, v9, 0x1

    move v9, v2

    move-object v8, v1

    goto :goto_3

    :cond_4
    if-eqz v8, :cond_1

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v8, Lcom/google/android/gms/internal/pj$b;->g:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x25

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " declares multiple JSON fields named "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    move-object/from16 v0, p3

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/or;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object p2

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/po;->a()Ljava/lang/Class;

    move-result-object p3

    goto/16 :goto_1

    :cond_6
    move-object v1, v10

    goto/16 :goto_0

    :cond_7
    move-object v1, v8

    goto :goto_4
.end method

.method static a(Ljava/lang/reflect/Field;ZLcom/google/android/gms/internal/ot;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/ot;->a(Ljava/lang/Class;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2, p0, p1}, Lcom/google/android/gms/internal/ot;->a(Ljava/lang/reflect/Field;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/nr;",
            "Lcom/google/android/gms/internal/po",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/po;->a()Ljava/lang/Class;

    move-result-object v2

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/pj;->a:Lcom/google/android/gms/internal/os;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/os;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/ox;

    move-result-object v3

    new-instance v1, Lcom/google/android/gms/internal/pj$a;

    invoke-direct {p0, p1, p2, v2}, Lcom/google/android/gms/internal/pj;->a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;Ljava/lang/Class;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v3, v2, v0}, Lcom/google/android/gms/internal/pj$a;-><init>(Lcom/google/android/gms/internal/ox;Ljava/util/Map;Lcom/google/android/gms/internal/pj$1;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public a(Ljava/lang/reflect/Field;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/pj;->c:Lcom/google/android/gms/internal/ot;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/pj;->a(Ljava/lang/reflect/Field;ZLcom/google/android/gms/internal/ot;)Z

    move-result v0

    return v0
.end method
