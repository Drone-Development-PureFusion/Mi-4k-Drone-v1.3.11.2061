.class Lcom/google/android/gms/wearable/WearableListenerService$c$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/WearableListenerService$c;->a(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wearable/internal/NodeParcelable;

.field final synthetic b:Lcom/google/android/gms/wearable/WearableListenerService$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService$c;Lcom/google/android/gms/wearable/internal/NodeParcelable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/WearableListenerService$c$3;->b:Lcom/google/android/gms/wearable/WearableListenerService$c;

    iput-object p2, p0, Lcom/google/android/gms/wearable/WearableListenerService$c$3;->a:Lcom/google/android/gms/wearable/internal/NodeParcelable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$c$3;->b:Lcom/google/android/gms/wearable/WearableListenerService$c;

    iget-object v0, v0, Lcom/google/android/gms/wearable/WearableListenerService$c;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$c$3;->a:Lcom/google/android/gms/wearable/internal/NodeParcelable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/WearableListenerService;->a(Lcom/google/android/gms/wearable/o;)V

    return-void
.end method
