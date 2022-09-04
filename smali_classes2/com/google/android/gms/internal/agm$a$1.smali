.class Lcom/google/android/gms/internal/agm$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/internal/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agm$a;-><init>(Lcom/google/android/gms/internal/agm;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/agm;

.field final synthetic b:Lcom/google/android/gms/internal/agm$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agm$a;Lcom/google/android/gms/internal/agm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$a$1;->b:Lcom/google/android/gms/internal/agm$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/agm$a$1;->a:Lcom/google/android/gms/internal/agm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/agm$a$1;->b:Lcom/google/android/gms/internal/agm$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$a$1;->b:Lcom/google/android/gms/internal/agm$a;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x837

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/agm$a;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/a$b;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/agm$a;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method

.method public a(JILjava/lang/Object;)V
    .locals 7

    if-nez p4, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agm$a$1;->b:Lcom/google/android/gms/internal/agm$a;

    new-instance v1, Lcom/google/android/gms/internal/agm$e;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, p3, v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-wide v4, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/agm$e;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;JLorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/agm$a;->b(Lcom/google/android/gms/common/api/m;)V

    :goto_0
    return-void

    :cond_0
    check-cast p4, Lcom/google/android/gms/internal/ago;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ago;->j()Ljava/lang/String;

    move-result-object v3

    if-nez p3, :cond_1

    if-eqz v3, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$a$1;->b:Lcom/google/android/gms/internal/agm$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/agm$a;->e:Lcom/google/android/gms/internal/agm;

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/internal/agm;Ljava/lang/String;)Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/agm$a$1;->b:Lcom/google/android/gms/internal/agm$a;

    new-instance v1, Lcom/google/android/gms/internal/agm$e;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ago;->c()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v2, p3, v4, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ago;->k()J

    move-result-wide v4

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ago;->d()Lorg/json/JSONObject;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/agm$e;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;JLorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/agm$a;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/agm$a$1;->b:Lcom/google/android/gms/internal/agm$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$a$1;->b:Lcom/google/android/gms/internal/agm$a;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/agm$a;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/a$b;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/agm$a;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_0
.end method
