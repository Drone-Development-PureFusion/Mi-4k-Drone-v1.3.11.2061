.class public Lcom/google/android/gms/measurement/internal/ab;
.super Lcom/google/android/gms/measurement/internal/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/measurement/internal/ab$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:C

.field private final c:J

.field private final d:Lcom/google/android/gms/measurement/internal/ab$a;

.field private final e:Lcom/google/android/gms/measurement/internal/ab$a;

.field private final f:Lcom/google/android/gms/measurement/internal/ab$a;

.field private final g:Lcom/google/android/gms/measurement/internal/ab$a;

.field private final h:Lcom/google/android/gms/measurement/internal/ab$a;

.field private final i:Lcom/google/android/gms/measurement/internal/ab$a;

.field private final j:Lcom/google/android/gms/measurement/internal/ab$a;

.field private final k:Lcom/google/android/gms/measurement/internal/ab$a;

.field private final l:Lcom/google/android/gms/measurement/internal/ab$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/aj;)V
    .locals 6

    const/4 v5, 0x6

    const/4 v4, 0x5

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/b;-><init>(Lcom/google/android/gms/measurement/internal/aj;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/ab;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/ab;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->M()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/ab;->c:J

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/ab;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/ab;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x50

    :goto_0
    iput-char v0, p0, Lcom/google/android/gms/measurement/internal/ab;->b:C

    :goto_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/ab$a;

    invoke-direct {v0, p0, v5, v2, v2}, Lcom/google/android/gms/measurement/internal/ab$a;-><init>(Lcom/google/android/gms/measurement/internal/ab;IZZ)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->d:Lcom/google/android/gms/measurement/internal/ab$a;

    new-instance v0, Lcom/google/android/gms/measurement/internal/ab$a;

    invoke-direct {v0, p0, v5, v3, v2}, Lcom/google/android/gms/measurement/internal/ab$a;-><init>(Lcom/google/android/gms/measurement/internal/ab;IZZ)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->e:Lcom/google/android/gms/measurement/internal/ab$a;

    new-instance v0, Lcom/google/android/gms/measurement/internal/ab$a;

    invoke-direct {v0, p0, v5, v2, v3}, Lcom/google/android/gms/measurement/internal/ab$a;-><init>(Lcom/google/android/gms/measurement/internal/ab;IZZ)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->f:Lcom/google/android/gms/measurement/internal/ab$a;

    new-instance v0, Lcom/google/android/gms/measurement/internal/ab$a;

    invoke-direct {v0, p0, v4, v2, v2}, Lcom/google/android/gms/measurement/internal/ab$a;-><init>(Lcom/google/android/gms/measurement/internal/ab;IZZ)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->g:Lcom/google/android/gms/measurement/internal/ab$a;

    new-instance v0, Lcom/google/android/gms/measurement/internal/ab$a;

    invoke-direct {v0, p0, v4, v3, v2}, Lcom/google/android/gms/measurement/internal/ab$a;-><init>(Lcom/google/android/gms/measurement/internal/ab;IZZ)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->h:Lcom/google/android/gms/measurement/internal/ab$a;

    new-instance v0, Lcom/google/android/gms/measurement/internal/ab$a;

    invoke-direct {v0, p0, v4, v2, v3}, Lcom/google/android/gms/measurement/internal/ab$a;-><init>(Lcom/google/android/gms/measurement/internal/ab;IZZ)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->i:Lcom/google/android/gms/measurement/internal/ab$a;

    new-instance v0, Lcom/google/android/gms/measurement/internal/ab$a;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1, v2, v2}, Lcom/google/android/gms/measurement/internal/ab$a;-><init>(Lcom/google/android/gms/measurement/internal/ab;IZZ)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->j:Lcom/google/android/gms/measurement/internal/ab$a;

    new-instance v0, Lcom/google/android/gms/measurement/internal/ab$a;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1, v2, v2}, Lcom/google/android/gms/measurement/internal/ab$a;-><init>(Lcom/google/android/gms/measurement/internal/ab;IZZ)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->k:Lcom/google/android/gms/measurement/internal/ab$a;

    new-instance v0, Lcom/google/android/gms/measurement/internal/ab$a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1, v2, v2}, Lcom/google/android/gms/measurement/internal/ab$a;-><init>(Lcom/google/android/gms/measurement/internal/ab;IZZ)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->l:Lcom/google/android/gms/measurement/internal/ab$a;

    return-void

    :cond_0
    const/16 v0, 0x43

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/ab;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x70

    :goto_2
    iput-char v0, p0, Lcom/google/android/gms/measurement/internal/ab;->b:C

    goto :goto_1

    :cond_2
    const/16 v0, 0x63

    goto :goto_2
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, ""

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method static a(ZLjava/lang/Object;)Ljava/lang/String;
    .locals 10

    const/4 v2, 0x0

    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    if-nez p1, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_d

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_1
    instance-of v0, v1, Ljava/lang/Long;

    if-eqz v0, :cond_4

    if-nez p0, :cond_1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v4

    const-wide/16 v6, 0x64

    cmp-long v0, v4, v6

    if-gez v0, :cond_2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x2d

    if-ne v0, v2, :cond_3

    const-string v0, "-"

    :goto_2
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-double v2, v2

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    int-to-double v4, v1

    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x2b

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    const-string v0, ""

    goto :goto_2

    :cond_4
    instance-of v0, v1, Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_5
    instance-of v0, v1, Ljava/lang/Throwable;

    if-eqz v0, :cond_b

    check-cast v1, Ljava/lang/Throwable;

    new-instance v3, Ljava/lang/StringBuilder;

    if-eqz p0, :cond_7

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v0, Lcom/google/android/gms/measurement/AppMeasurement;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/ab;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-class v0, Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/ab;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    array-length v6, v1

    move v0, v2

    :goto_4
    if-ge v0, v6, :cond_a

    aget-object v2, v1, v0

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v7

    if-eqz v7, :cond_8

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_8
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/ab;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    :cond_9
    const-string v0, ": "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_a
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_b
    if-eqz p0, :cond_c

    const-string v0, "-"

    goto/16 :goto_0

    :cond_c
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_d
    move-object v1, p1

    goto/16 :goto_1
.end method

.method static a(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-static {p0, p2}, Lcom/google/android/gms/measurement/internal/ab;->a(ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p3}, Lcom/google/android/gms/measurement/internal/ab;->a(ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, p4}, Lcom/google/android/gms/measurement/internal/ab;->a(ZLjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    :cond_3
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A()Lcom/google/android/gms/measurement/internal/ab$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->h:Lcom/google/android/gms/measurement/internal/ab$a;

    return-object v0
.end method

.method public B()Lcom/google/android/gms/measurement/internal/ab$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->i:Lcom/google/android/gms/measurement/internal/ab$a;

    return-object v0
.end method

.method public C()Lcom/google/android/gms/measurement/internal/ab$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->j:Lcom/google/android/gms/measurement/internal/ab$a;

    return-object v0
.end method

.method public D()Lcom/google/android/gms/measurement/internal/ab$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->k:Lcom/google/android/gms/measurement/internal/ab$a;

    return-object v0
.end method

.method public E()Lcom/google/android/gms/measurement/internal/ab$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->l:Lcom/google/android/gms/measurement/internal/ab$a;

    return-object v0
.end method

.method public F()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/ab;->x()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->b:Lcom/google/android/gms/measurement/internal/af$c;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af$c;->a()Landroid/util/Pair;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/measurement/internal/af;->a:Landroid/util/Pair;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected a(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->a:Ljava/lang/String;

    invoke-static {p1, v0, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 10

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->n:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->k()Lcom/google/android/gms/measurement/internal/ai;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x6

    const-string v1, "Scheduler not set. Not logging error/warn."

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/measurement/internal/ab;->a(ILjava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ai;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x6

    const-string v1, "Scheduler not initialized. Not logging error/warn."

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/measurement/internal/ab;->a(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ai;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x6

    const-string v1, "Scheduler shutdown. Not logging error/warn."

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/measurement/internal/ab;->a(ILjava/lang/String;)V

    goto :goto_0

    :cond_2
    if-gez p1, :cond_3

    const/4 p1, 0x0

    :cond_3
    const-string v0, "01VDIWEA?"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p1, v0, :cond_4

    const-string v0, "01VDIWEA?"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 p1, v0, -0x1

    :cond_4
    const-string v0, "1"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "01VDIWEA?"

    invoke-virtual {v2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    iget-char v3, p0, Lcom/google/android/gms/measurement/internal/ab;->b:C

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/ab;->c:J

    const/4 v6, 0x1

    invoke-static {v6, p2, p3, p4, p5}, Lcom/google/android/gms/measurement/internal/ab;->a(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, 0x17

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v8, v9

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x400

    if-le v2, v3, :cond_5

    const/4 v0, 0x0

    const/16 v2, 0x400

    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_5
    new-instance v2, Lcom/google/android/gms/measurement/internal/ab$1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/measurement/internal/ab$1;-><init>(Lcom/google/android/gms/measurement/internal/ab;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/ai;->a(Ljava/lang/Runnable;)V

    goto/16 :goto_0
.end method

.method protected a(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/ab;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0, p4, p5, p6, p7}, Lcom/google/android/gms/measurement/internal/ab;->a(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/ab;->a(ILjava/lang/String;)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_1

    move-object v0, p0

    move v1, p1

    move-object v2, p4

    move-object v3, p5

    move-object v4, p6

    move-object v5, p7

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/ab;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method protected a(I)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method protected e()V
    .locals 0

    return-void
.end method

.method public f()Lcom/google/android/gms/measurement/internal/ab$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->d:Lcom/google/android/gms/measurement/internal/ab$a;

    return-object v0
.end method

.method public g()Lcom/google/android/gms/measurement/internal/ab$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->e:Lcom/google/android/gms/measurement/internal/ab$a;

    return-object v0
.end method

.method public bridge synthetic h()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->h()V

    return-void
.end method

.method public bridge synthetic i()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->i()V

    return-void
.end method

.method public bridge synthetic j()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->j()V

    return-void
.end method

.method public bridge synthetic k()Lcom/google/android/gms/measurement/internal/o;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->k()Lcom/google/android/gms/measurement/internal/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lcom/google/android/gms/measurement/internal/d;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->l()Lcom/google/android/gms/measurement/internal/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Lcom/google/android/gms/measurement/internal/z;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->m()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Lcom/google/android/gms/measurement/internal/s;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->n()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o()Lcom/google/android/gms/measurement/internal/e;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->o()Lcom/google/android/gms/measurement/internal/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p()Lcom/google/android/gms/common/util/e;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->p()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->q()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r()Lcom/google/android/gms/measurement/internal/q;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->r()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic s()Lcom/google/android/gms/measurement/internal/m;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->s()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t()Lcom/google/android/gms/measurement/internal/ah;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->t()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u()Lcom/google/android/gms/measurement/internal/g;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->u()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Lcom/google/android/gms/measurement/internal/ai;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->v()Lcom/google/android/gms/measurement/internal/ai;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic w()Lcom/google/android/gms/measurement/internal/ab;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic x()Lcom/google/android/gms/measurement/internal/af;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->x()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic y()Lcom/google/android/gms/measurement/internal/p;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    return-object v0
.end method

.method public z()Lcom/google/android/gms/measurement/internal/ab$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/ab;->g:Lcom/google/android/gms/measurement/internal/ab$a;

    return-object v0
.end method
