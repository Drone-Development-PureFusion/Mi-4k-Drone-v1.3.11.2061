.class Lcom/google/android/gms/contextmanager/fence/internal/e$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/contextmanager/fence/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/awareness/fence/i;

.field private final b:Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/awareness/fence/i;Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/awareness/fence/i;

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/e$a;->a:Lcom/google/android/gms/awareness/fence/i;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/e$a;->b:Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/e$a;->a:Lcom/google/android/gms/awareness/fence/i;

    iget-object v1, p0, Lcom/google/android/gms/contextmanager/fence/internal/e$a;->b:Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;

    invoke-virtual {v1}, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/fence/internal/e$a;->b:Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;

    invoke-virtual {v2}, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;->b()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/awareness/fence/i;->a(Ljava/lang/String;Z)V

    return-void
.end method
