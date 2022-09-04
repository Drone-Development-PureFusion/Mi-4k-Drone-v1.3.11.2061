.class Lcom/google/android/gms/cast/a$b$a$7;
.super Lcom/google/android/gms/cast/internal/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/a$b$a;->c(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/cast/a$b$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/a$b$a;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/a$b$a$7;->b:Lcom/google/android/gms/cast/a$b$a;

    iput-object p3, p0, Lcom/google/android/gms/cast/a$b$a$7;->a:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/cast/internal/i;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/internal/e;)V
    .locals 2

    const/16 v1, 0x7d1

    iget-object v0, p0, Lcom/google/android/gms/cast/a$b$a$7;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "IllegalArgument: sessionId cannot be null or empty"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/cast/a$b$a$7;->a(ILjava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/a$b$a$7;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/cast/internal/e;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ahl$b;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/cast/a$b$a$7;->a(I)V

    goto :goto_0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/a$b$a$7;->a(Lcom/google/android/gms/cast/internal/e;)V

    return-void
.end method
