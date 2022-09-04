.class public Lcom/google/android/gms/contextmanager/fence/internal/a;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/pv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/pv;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/pv;

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/a;->a:Lcom/google/android/gms/internal/pv;

    return-void
.end method

.method public static a(I[I)Lcom/google/android/gms/contextmanager/fence/internal/a;
    .locals 4

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/a;

    const-wide/16 v2, 0xbb8

    invoke-static {p0, p1, v2, v3}, Lcom/google/android/gms/contextmanager/fence/internal/a;->a(I[IJ)Lcom/google/android/gms/internal/pv;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/a;-><init>(Lcom/google/android/gms/internal/pv;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a([I)Lcom/google/android/gms/contextmanager/fence/internal/a;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0, p0}, Lcom/google/android/gms/contextmanager/fence/internal/a;->a(I[I)Lcom/google/android/gms/contextmanager/fence/internal/a;

    move-result-object v0

    return-object v0
.end method

.method private static a(I[IJ)Lcom/google/android/gms/internal/pv;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/pv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/pv;-><init>()V

    iput p0, v0, Lcom/google/android/gms/internal/pv;->a:I

    iput-wide p2, v0, Lcom/google/android/gms/internal/pv;->b:J

    iput-object p1, v0, Lcom/google/android/gms/internal/pv;->c:[I

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/pv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/a;->a:Lcom/google/android/gms/internal/pv;

    return-object v0
.end method
