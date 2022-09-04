.class public Lcom/google/android/gms/internal/jn;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/jk;


# instance fields
.field public final b:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/jn;->b:J

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    const v0, 0x3e4ccccd    # 0.2f

    return v0
.end method

.method public a(J)Z
    .locals 3

    const-wide/16 v0, 0x3e8

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(JJ)Z
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/internal/jn;->b:J

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    const-wide/16 v0, 0x3e8

    cmp-long v0, p3, v0

    if-lez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()J
    .locals 2

    const-wide/16 v0, 0x3e8

    return-wide v0
.end method
