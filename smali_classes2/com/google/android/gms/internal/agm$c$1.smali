.class Lcom/google/android/gms/internal/agm$c$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/internal/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agm$c;-><init>(Lcom/google/android/gms/internal/agm;Lcom/google/android/gms/cast/a/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/agm;

.field final synthetic b:Lcom/google/android/gms/internal/agm$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agm$c;Lcom/google/android/gms/internal/agm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    iput-object p2, p0, Lcom/google/android/gms/internal/agm$c$1;->a:Lcom/google/android/gms/internal/agm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x837

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/agm$c;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/a$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/agm$c;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method

.method public a(JILjava/lang/Object;)V
    .locals 9

    if-nez p4, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    new-instance v1, Lcom/google/android/gms/internal/agm$d;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, p3, v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    invoke-static {v3}, Lcom/google/android/gms/internal/agm$c;->a(Lcom/google/android/gms/internal/agm$c;)Lcom/google/android/gms/cast/a/a;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/agm$d;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/cast/a/a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/agm$c;->b(Lcom/google/android/gms/common/api/m;)V

    :goto_0
    return-void

    :cond_0
    check-cast p4, Lcom/google/android/gms/internal/ago;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ago;->m()Lcom/google/android/gms/internal/agn;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "1.0.0"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/agn;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    iget-object v1, v1, Lcom/google/android/gms/internal/agm$c;->b:Lcom/google/android/gms/internal/agm;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/internal/agm;Lcom/google/android/gms/internal/agn;)Lcom/google/android/gms/internal/agn;

    iget-object v1, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    iget-object v2, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    new-instance v3, Lcom/google/android/gms/common/api/Status;

    const/16 v4, 0x866

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v6, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/agn;->c()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    const-string v8, "1.0.0"

    aput-object v8, v7, v0

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/agm$c;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/a$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/agm$c;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/agm$c;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/a$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/agm$c;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    new-instance v1, Lcom/google/android/gms/internal/agm$d;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ago;->c()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, p3, v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/agm$c$1;->b:Lcom/google/android/gms/internal/agm$c;

    invoke-static {v3}, Lcom/google/android/gms/internal/agm$c;->a(Lcom/google/android/gms/internal/agm$c;)Lcom/google/android/gms/cast/a/a;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/agm$d;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/cast/a/a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/agm$c;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method
