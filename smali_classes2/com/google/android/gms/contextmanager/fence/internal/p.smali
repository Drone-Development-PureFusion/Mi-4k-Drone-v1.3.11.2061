.class public Lcom/google/android/gms/contextmanager/fence/internal/p;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/qt;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/qt;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/qt;

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/p;->a:Lcom/google/android/gms/internal/qt;

    return-void
.end method

.method public static a(ILjava/util/TimeZone;JJ)Lcom/google/android/gms/contextmanager/fence/internal/p;
    .locals 8

    const-wide/32 v6, 0x5265c00

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v0, p2, v4

    if-ltz v0, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    cmp-long v0, p2, v6

    if-gtz v0, :cond_2

    move v0, v1

    :goto_2
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    cmp-long v0, p4, v4

    if-ltz v0, :cond_3

    move v0, v1

    :goto_3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    cmp-long v0, p4, v6

    if-gtz v0, :cond_4

    move v0, v1

    :goto_4
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    cmp-long v0, p2, p4

    if-gtz v0, :cond_5

    :goto_5
    invoke-static {v1}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/p;

    invoke-static/range {p0 .. p5}, Lcom/google/android/gms/contextmanager/fence/internal/p;->b(ILjava/util/TimeZone;JJ)Lcom/google/android/gms/internal/qt;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/p;-><init>(Lcom/google/android/gms/internal/qt;)V

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_3

    :cond_4
    move v0, v2

    goto :goto_4

    :cond_5
    move v1, v2

    goto :goto_5
.end method

.method public static a(JJ)Lcom/google/android/gms/contextmanager/fence/internal/p;
    .locals 8

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    const/4 v0, 0x1

    cmp-long v1, p0, v4

    if-ltz v1, :cond_1

    move v1, v0

    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    cmp-long v1, p2, v4

    if-ltz v1, :cond_2

    move v1, v0

    :goto_1
    invoke-static {v1}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    cmp-long v1, p0, p2

    if-gtz v1, :cond_0

    move v2, v0

    :cond_0
    invoke-static {v2}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v6, Lcom/google/android/gms/contextmanager/fence/internal/p;

    const/4 v1, 0x0

    move-wide v2, p0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/fence/internal/p;->b(ILjava/util/TimeZone;JJ)Lcom/google/android/gms/internal/qt;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/google/android/gms/contextmanager/fence/internal/p;-><init>(Lcom/google/android/gms/internal/qt;)V

    return-object v6

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method private static b(ILjava/util/TimeZone;JJ)Lcom/google/android/gms/internal/qt;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/qt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/qt;-><init>()V

    iput p0, v0, Lcom/google/android/gms/internal/qt;->a:I

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/qt;->b:Ljava/lang/String;

    :cond_0
    iput-wide p2, v0, Lcom/google/android/gms/internal/qt;->c:J

    iput-wide p4, v0, Lcom/google/android/gms/internal/qt;->d:J

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/qt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/p;->a:Lcom/google/android/gms/internal/qt;

    return-object v0
.end method
