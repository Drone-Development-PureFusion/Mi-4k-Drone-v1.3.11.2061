.class Lcom/google/android/gms/tagmanager/dm$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/dm$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/dm;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/tagmanager/dm;

.field private c:Ljava/lang/Long;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/dm;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dm$3;->b:Lcom/google/android/gms/tagmanager/dm;

    iput-boolean p2, p0, Lcom/google/android/gms/tagmanager/dm$3;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$3;->c:Ljava/lang/Long;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$3;->b:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->c(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/dn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/dn;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dm$3;->c:Ljava/lang/Long;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$3;->c:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tagmanager/a;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/google/android/gms/tagmanager/dm$3;->a:Z

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/a;->b()J

    move-result-wide v2

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/dm$3;->a()J

    move-result-wide v4

    add-long/2addr v2, v4

    iget-object v4, p0, Lcom/google/android/gms/tagmanager/dm$3;->b:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v4}, Lcom/google/android/gms/tagmanager/dm;->d(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/common/util/e;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/a;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method
