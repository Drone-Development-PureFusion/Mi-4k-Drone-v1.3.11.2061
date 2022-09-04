.class public final Lcom/google/android/gms/internal/ns;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/google/android/gms/internal/ot;

.field private b:Lcom/google/android/gms/internal/oh;

.field private c:Lcom/google/android/gms/internal/nq;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/android/gms/internal/nt",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ok;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ok;",
            ">;"
        }
    .end annotation
.end field

.field private g:I

.field private h:I

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ot;->a:Lcom/google/android/gms/internal/ot;

    iput-object v0, p0, Lcom/google/android/gms/internal/ns;->a:Lcom/google/android/gms/internal/ot;

    sget-object v0, Lcom/google/android/gms/internal/oh;->a:Lcom/google/android/gms/internal/oh;

    iput-object v0, p0, Lcom/google/android/gms/internal/ns;->b:Lcom/google/android/gms/internal/oh;

    sget-object v0, Lcom/google/android/gms/internal/no;->a:Lcom/google/android/gms/internal/no;

    iput-object v0, p0, Lcom/google/android/gms/internal/ns;->c:Lcom/google/android/gms/internal/nq;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ns;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ns;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ns;->f:Ljava/util/List;

    iput v1, p0, Lcom/google/android/gms/internal/ns;->g:I

    iput v1, p0, Lcom/google/android/gms/internal/ns;->h:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ns;->i:Z

    return-void
.end method

.method private a(Ljava/lang/String;IILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ok;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x2

    if-eqz p1, :cond_1

    const-string v0, ""

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/nl;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/nl;-><init>(Ljava/lang/String;)V

    :goto_0
    const-class v1, Ljava/util/Date;

    invoke-static {v1}, Lcom/google/android/gms/internal/po;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/po;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/oi;->a(Lcom/google/android/gms/internal/po;Ljava/lang/Object;)Lcom/google/android/gms/internal/ok;

    move-result-object v1

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v1, Ljava/sql/Timestamp;

    invoke-static {v1}, Lcom/google/android/gms/internal/po;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/po;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/oi;->a(Lcom/google/android/gms/internal/po;Ljava/lang/Object;)Lcom/google/android/gms/internal/ok;

    move-result-object v1

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v1, Ljava/sql/Date;

    invoke-static {v1}, Lcom/google/android/gms/internal/po;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/po;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/oi;->a(Lcom/google/android/gms/internal/po;Ljava/lang/Object;)Lcom/google/android/gms/internal/ok;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    if-eq p2, v2, :cond_0

    if-eq p3, v2, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/nl;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/nl;-><init>(II)V

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/ns;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ns;->i:Z

    return-object p0
.end method

.method public a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/android/gms/internal/ns;
    .locals 2

    instance-of v0, p2, Lcom/google/android/gms/internal/of;

    if-nez v0, :cond_0

    instance-of v0, p2, Lcom/google/android/gms/internal/nw;

    if-nez v0, :cond_0

    instance-of v0, p2, Lcom/google/android/gms/internal/nt;

    if-nez v0, :cond_0

    instance-of v0, p2, Lcom/google/android/gms/internal/oj;

    if-eqz v0, :cond_5

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/op;->a(Z)V

    instance-of v0, p2, Lcom/google/android/gms/internal/nt;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ns;->d:Ljava/util/Map;

    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/nt;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    instance-of v0, p2, Lcom/google/android/gms/internal/of;

    if-nez v0, :cond_2

    instance-of v0, p2, Lcom/google/android/gms/internal/nw;

    if-eqz v0, :cond_3

    :cond_2
    invoke-static {p1}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ns;->e:Ljava/util/List;

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/oi;->b(Lcom/google/android/gms/internal/po;Ljava/lang/Object;)Lcom/google/android/gms/internal/ok;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    instance-of v0, p2, Lcom/google/android/gms/internal/oj;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ns;->e:Ljava/util/List;

    invoke-static {p1}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object v1

    check-cast p2, Lcom/google/android/gms/internal/oj;

    invoke-static {v1, p2}, Lcom/google/android/gms/internal/pn;->a(Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/oj;)Lcom/google/android/gms/internal/ok;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object p0

    :cond_5
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public varargs a([I)Lcom/google/android/gms/internal/ns;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ns;->a:Lcom/google/android/gms/internal/ot;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ot;->a([I)Lcom/google/android/gms/internal/ot;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ns;->a:Lcom/google/android/gms/internal/ot;

    return-object p0
.end method

.method public varargs a([Lcom/google/android/gms/internal/nm;)Lcom/google/android/gms/internal/ns;
    .locals 5

    const/4 v4, 0x1

    array-length v1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p1, v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ns;->a:Lcom/google/android/gms/internal/ot;

    invoke-virtual {v3, v2, v4, v4}, Lcom/google/android/gms/internal/ot;->a(Lcom/google/android/gms/internal/nm;ZZ)Lcom/google/android/gms/internal/ot;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ns;->a:Lcom/google/android/gms/internal/ot;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public b()Lcom/google/android/gms/internal/nr;
    .locals 12

    const/4 v4, 0x0

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ns;->e:Ljava/util/List;

    invoke-interface {v11, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v11}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ns;->f:Ljava/util/List;

    invoke-interface {v11, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/internal/ns;->g:I

    iget v2, p0, Lcom/google/android/gms/internal/ns;->h:I

    invoke-direct {p0, v0, v1, v2, v11}, Lcom/google/android/gms/internal/ns;->a(Ljava/lang/String;IILjava/util/List;)V

    new-instance v0, Lcom/google/android/gms/internal/nr;

    iget-object v1, p0, Lcom/google/android/gms/internal/ns;->a:Lcom/google/android/gms/internal/ot;

    iget-object v2, p0, Lcom/google/android/gms/internal/ns;->c:Lcom/google/android/gms/internal/nq;

    iget-object v3, p0, Lcom/google/android/gms/internal/ns;->d:Ljava/util/Map;

    iget-boolean v7, p0, Lcom/google/android/gms/internal/ns;->i:Z

    iget-object v10, p0, Lcom/google/android/gms/internal/ns;->b:Lcom/google/android/gms/internal/oh;

    move v5, v4

    move v6, v4

    move v8, v4

    move v9, v4

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/nr;-><init>(Lcom/google/android/gms/internal/ot;Lcom/google/android/gms/internal/nq;Ljava/util/Map;ZZZZZZLcom/google/android/gms/internal/oh;Ljava/util/List;)V

    return-object v0
.end method
